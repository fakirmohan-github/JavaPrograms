package com.ps.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MpaVsFlatMapExample {
    public static void main(String[] args) {
        List<Employee_Map_FlatMap_Ex> empList=new ArrayList<Employee_Map_FlatMap_Ex>();

        List<String> citiList1= Arrays.asList("Bangalore","Mumbai","Pune");
        Employee_Map_FlatMap_Ex emp1 =new Employee_Map_FlatMap_Ex(101,"Fakir",citiList1);

        List<String> citiList2= Arrays.asList("BBSR","Kolkata","Pune");
        Employee_Map_FlatMap_Ex emp2 =new Employee_Map_FlatMap_Ex(102,"Mohan",citiList2);

        List<String> citiList3= Arrays.asList("Bangalore","Hyderabad","Mumbai");
        Employee_Map_FlatMap_Ex emp3 =new Employee_Map_FlatMap_Ex(103,"Nayak",citiList3);

        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);

        //map example ---> print list of employee names in the emplist
        List<String> empNameList=empList.stream().map(emp->emp.getName()).collect(Collectors.toList());
        System.out.println("Employee Name List is :: "+empNameList);

        //flatmap example ---> without flat map --> find list of working cities of employee
        List<List<String>> citiList=empList.stream().map(emp->emp.getCitiesWorkedIn()).collect(Collectors.toList());
        System.out.println("Employee Working Cities List without using flatmap:: "+citiList);

        //flatmap example ---> with flat map --> find list of working cities of employee
        List<String> citiesList=empList.stream().flatMap(emp->emp.getCitiesWorkedIn().stream()).collect(Collectors.toList());
        System.out.println("Employee Working Cities List using flatmap:: "+citiesList);

        //flatmap example ---> with flat map --> find list of distict working cities of employee
        Set<String> distinctcitiesList=empList.stream().flatMap(emp->emp.getCitiesWorkedIn().stream()).collect(Collectors.toSet());
        System.out.println("Employee Working Distinct Cities List using flatmap:: "+distinctcitiesList);


    }

}
