package com.ps.y_2026.march;

@FunctionalInterface
public interface MyFunctionalInterface {
    void abstractMethod();
    default void defaultMethod1(){
        System.out.println("Utility Default Method 1");
    }
    default void defaultMethod2(){
        System.out.println("Utility Default Method 2");
    }
    static void staticMethod1(){
        System.out.println("Utility Static Method 1");
    }
    static void staticMethod2(){
        System.out.println("Utility Static Method 2");
    }
}
