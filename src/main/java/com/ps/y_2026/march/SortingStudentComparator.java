package com.ps.y_2026.march;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingStudentComparator {
    public static void main(String[] args) {
        Student s1 = new Student(101,"Fakir");
        Student s2= new Student(102, "AMohan");
        Student s3= new Student(100, "Nayak");

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        studentList.stream().forEach(s->System.out.print(s.getName()+" "));
        System.out.println("Sorting Using Comparable");

        //default sorting with comparable
        Collections.sort(studentList);
        studentList.stream().forEach(s->System.out.print(s.getName()+" "));

        //lambda sorting
        System.out.println("\nLamda Sorting");
        studentList.sort((s11,s22)->s11.id- s22.id);
        studentList.forEach(s->System.out.print(s.getName()+" "));

        Collections.sort(studentList,new StudentNameComparator());
        System.out.println();
        studentList.stream().forEach(s->System.out.print(s.getName()+" "));
        System.out.println();
        Collections.sort(studentList,new StudentIdComparator());
        studentList.stream().forEach(s->System.out.print(s.getName()+" "));

        System.out.println();
        studentList.stream()
                .sorted(Comparator.comparing(Student::getName))
                .forEach(student -> System.out.println(student.getName()));

        System.out.println();

        studentList.stream()
                .sorted(Comparator.comparing(Student::getId))
                .forEach(student -> System.out.println(student.getName()));

    }
}
