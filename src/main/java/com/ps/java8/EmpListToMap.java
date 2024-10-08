package com.ps.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpListToMap {
    public static void main(String[] args) {
        Employee e1 = new Employee("ABC", 10000);
        Employee e2 = new Employee("PQR", 20000);
        List<Employee> listOfEmps = new ArrayList<>();
        listOfEmps.add(e1);
        listOfEmps.add(e2);


        listOfEmps.stream()
                .collect(Collectors.toMap(Employee::getName, emp->emp))
                .forEach((x, y) -> System.out.println(x + "::" + y));

        System.out.println("\n");


        Map<String, Object> empMap = listOfEmps.stream()
                .collect(Collectors.toMap(Employee::getName, Employee::toString));
        System.out.println(empMap);
    }
}
