package com.ps.java8;

public interface InterfaceDemo {
    //Had to override newly created method b4 Java8
    //public void print();

    //default methods allows us to write implementation of any no of default methods and we can override the same as well.
    default void defaultMethod1(){
        System.out.println("Utility :: Default Method 1");
    }
    default void defaultMethod2(){
        System.out.println("Utility :: Default Method 2");
    }
//We write static method so that the implementation class does not required the object to create explicitely
    static void staticMethod1(){
        System.out.println("Utility :: Static Method 1");
    }
    static void staticMethod2(){
        System.out.println("Utility :: Static Method 2");
    }


}
