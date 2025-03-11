package com.ps.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Student1{
    int id;
    int mark;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student1(int id, int mark, String name) {
        this.id = id;
        this.mark = mark;
        this.name = name;
    }

    public static List<Student1> getStudents(){
        List<Student1> stdList = new ArrayList<>();
        stdList.add(new Student1(11,28,"Lucy"));
        stdList.add(new Student1(12,29,"Kiku"));
        stdList.add(new Student1(13,30,"Lucy"));
        return stdList;
    }
}

public class AnyMatchEx {
    public static void main(String[] args) {
        Predicate<Student1> p1=s->s.getName().startsWith("K");
        Predicate<Student1> p2= s->s.getMark() > 21 && s.getName().startsWith("Z");

        List<Student1> list = Student1.getStudents();

        System.out.println("--- Any Match ---");
        boolean b1= list.stream().anyMatch(p1);
        System.out.println(b1);
        boolean b2=list.stream().anyMatch(p2);
        System.out.println(b2);

        System.out.println("--- allMatch Match ---");
        boolean b3=list.stream().allMatch(p1);
        System.out.println(b3);
        boolean b4 = list.stream().allMatch(p2);
        System.out.println(b4);

        System.out.println("--- noneMatch Match ---");
        boolean b5=list.stream().noneMatch(p1);
        System.out.println(b5);
        boolean b6 = list.stream().noneMatch(p2);
        System.out.println(b6);




    }
}
