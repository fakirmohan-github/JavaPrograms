package com.ps.java8;

public class InterfaceImpl1Demo implements InterfaceDemo{

    @Override
    public void defaultMethod1() {
        System.out.println("Overridden default method");
    }

    public static void main(String[] args) {
        InterfaceImpl1Demo id1=new InterfaceImpl1Demo();
        id1.defaultMethod1();
        id1.defaultMethod2();
    }

}
