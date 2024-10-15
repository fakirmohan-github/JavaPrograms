package com.ps.interview;

@FunctionalInterface
public interface FunctionalInterfaceDemo {
    public void absMethod();

    default void default1(){
        System.out.println("Default 1");
    }

    default void default2(){
        System.out.println("Default 2");
    }

    public static void staticMethod1(){
        System.out.println("Static 1");
    }

    public static void staticMethod2(){
        System.out.println("Static 2");
    }

}
