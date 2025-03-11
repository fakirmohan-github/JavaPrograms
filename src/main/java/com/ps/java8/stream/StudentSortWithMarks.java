package com.ps.java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student implements Comparable<Student>{
    int id;
    String name;
    int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.marks,o.marks);
    }
}

class StudentIdComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getId()-o2.getId();
    }
}

public class StudentSortWithMarks {
    public static void main(String[] args) {
        List<Student> stdList=new ArrayList<>();
        stdList.add(new Student(101,"Fakir",201));
        stdList.add(new Student(102,"Mohan",301));
        stdList.add(new Student(103,"Nayak",401));

        //Find Students those having marks greater than 300 with descending/ascending order
        stdList.stream()
                .filter(s->s.getMarks() > 300)
                //.sorted(Comparator.comparing(Student::getMarks).reversed())
                .sorted(new StudentIdComparator())
                .forEach(s->System.out.println(" Id "+s.getId()+" Name : "+s.getName()+" Marks : "+s.getMarks()));

    }

}
