package com.ps.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmpWithNameAndCity {
    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList<>();

        Employee e1=new Employee("Fakir",10000);
        Employee e2=new Employee("Mohan",20000);
        Employee e3=new Employee("Fakir",15000);

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getName)
                        .thenComparing(Employee::getSalary))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
