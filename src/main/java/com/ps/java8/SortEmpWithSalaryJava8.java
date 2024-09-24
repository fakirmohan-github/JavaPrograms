package com.ps.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmpWithSalaryJava8 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Fakir", 10000);
        Employee e2 = new Employee("Mohan", 20000);
        Employee e3 = new Employee("Nayak", 5000);
        List<Employee> empList = new ArrayList<Employee>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        System.out.println("Before Sorting :: ");
        empList.stream().forEach(i -> System.out.println(i.getName()));
        List<Employee> sortedListWithAsc = empList.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
        System.out.println("After Salary Ascending Sorting");
        sortedListWithAsc.stream().forEach(i -> System.out.println(i.getName()));
        List<Employee> sortedListDesc = empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
        System.out.println("After Salary Desc Sorting ");
        sortedListDesc.stream().forEach(i -> System.out.println(i.getName()));
    }
}
