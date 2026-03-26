package com.ps.interview;

import java.util.*;
import java.util.stream.*;

class Employee {
    int empId;
    String name;
    double salary;
    int deptId;

    public Employee(int empId, String name, double salary, int deptId) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.deptId = deptId;
    }

    public int getDeptId() { return deptId; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return empId + " " + name + " " + salary + " Dept:" + deptId;
    }
}

public class Top3Employees {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "A", 5000, 1),
                new Employee(2, "B", 7000, 1),
                new Employee(3, "C", 6000, 1),
                new Employee(4, "D", 8000, 1),
                new Employee(5, "E", 9000, 2),
                new Employee(6, "F", 4000, 2),
                new Employee(7, "G", 9500, 2)
        );

        Map<Integer, List<Employee>> result =
                employees.stream()
                        .collect(Collectors.groupingBy(Employee::getDeptId,
                                Collectors.collectingAndThen(Collectors.toList(), list ->
                                        list.stream()
                                                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                                                .limit(3)
                                                .collect(Collectors.toList())
                                )
                        ));

        result.forEach((dept, empList) -> {
            System.out.println("Dept " + dept);
            empList.forEach(System.out::println);
        });
    }
}
