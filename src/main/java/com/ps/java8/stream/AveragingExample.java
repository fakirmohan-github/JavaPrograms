package com.ps.java8.stream;

import java.util.List;
import java.util.stream.Collectors;

public class AveragingExample {
    public static void main(String[] args) {
        List<Student1> stdList=Student1.getStudents();

        //Averaging

        Double avgMarks=
                stdList.stream().collect(Collectors.averagingInt(s->s.getMark()));

        System.out.println("Average marks "+avgMarks);



    }
}
