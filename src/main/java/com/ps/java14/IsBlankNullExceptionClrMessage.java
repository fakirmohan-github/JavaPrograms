package com.ps.java14;

class Employee{
    String name;
}
public class IsBlankNullExceptionClrMessage {

    public static void main(String[] args) {
        /*String string=null;
        string.isBlank();*/
        //Cannot invoke "String.isBlank()" because "string" is null
        //	at com.ps.java14.IsBlankNullExceptionClrMessage.main(IsBlankNullExceptionClrMessage.java:7)
        //With this message we can easily track what is null for a chain object call.

        Employee employee=new Employee();
        employee.name=null;
        employee.name.isBlank();//Here we can identify if employee is null or employee.name is null with the help of exception
        //Cannot invoke "String.isBlank()" because "employee.name" is null
        //	at com.ps.java14.IsBlankNullExceptionClrMessage.main(IsBlankNullExceptionClrMessage.java:17)

    }}
