package com.ps.java8;

@FunctionalInterface
public interface FunctionalInterfaceDemo {
    public void singleAbstractMethod();
  //  public void singleAbstractMethod1();

    public default void defaultMethod1(){
        System.out.println("Default Method 1");
    }

    public default void defaultMethod2(){
        System.out.println("Default Method 2");
    }

    public static void staticMethod1(){
        System.out.println("Static Method 1");
    }

    public static void staticMethod2(){
        System.out.println("Static Method 2");
    }

}
