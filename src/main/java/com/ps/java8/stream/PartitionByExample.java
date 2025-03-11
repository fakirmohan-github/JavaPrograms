package com.ps.java8.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionByExample {
    public static void main(String[] args) {
        List<Student1> stdList=Student1.getStudents();

        stdList.stream().forEach(s->System.out.print("   "+s.getName()));

        System.out.println("\n -----applying partitioning----");

        Map<Boolean,List<Student1>> stdMap=stdList.stream()
               .collect(Collectors.partitioningBy(s->s.getName().length() >= 4));
        System.out.println(stdMap);

    }
}

