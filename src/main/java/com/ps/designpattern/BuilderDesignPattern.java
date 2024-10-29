package com.ps.designpattern;

class Employee1 {
    private String empid;
    private String empname;
    private String dept;
    private Double salary;

    private Employee1(){}


    public Employee1 empid(String empid) {
        this.empid = empid;
        return this;
    }


    public Employee1 empname(String empname) {
        this.empname = empname;
        return this;
    }

    public Employee1 dept(String dept) {
        this.dept = dept;
        return this;
    }

    public Employee1 salary(Double salary) {
        this.salary = salary;
        return this;
    }

    public static Employee1 newInstance(){
        return new Employee1();
    }
    public static Employee1 newInstanceByID(String id){
        Employee1 emp = newInstance();
        emp.empid(id);
        return emp;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "empid='" + empid + '\'' +
                ", empname='" + empname + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class BuilderDesignPattern {
    public static void main(String[] args) {
        System.out.println(Employee1.newInstanceByID("a123").empname("Rahul").dept("HR").salary(12000.0));

    }
}
