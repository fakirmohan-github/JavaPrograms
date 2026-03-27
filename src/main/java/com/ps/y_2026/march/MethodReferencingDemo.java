package com.ps.y_2026.march;

public class MethodReferencingDemo {
    public static void main(String[] args) {
        MyFunctionalInterface myFunctionalInterface = ()->System.out.println("My functional Interface Abstract Method");
        myFunctionalInterface.abstractMethod();

        MyFunctionalInterface myFunctionalInterface1 = MethodReferencingDemo::test;
        myFunctionalInterface1.abstractMethod();
    }
    public static void test(){
        System.out.println("Reusability using Method Referncing");
    }
}
