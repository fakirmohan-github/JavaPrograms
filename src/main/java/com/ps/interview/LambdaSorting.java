package com.ps.interview;

import com.ps.y_2026.march.Student;

import java.util.*;

public class LambdaSorting {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student(2, "Amit"));
        list.add(new Student(1, "Ravi"));
        list.add(new Student(3, "Sita"));

        list.sort((s1, s2) -> s1.getId() - s2.getId());

        for (Student s : list) {
            System.out.println(s.getName() + " " + s.getId());
        }
    }
}
