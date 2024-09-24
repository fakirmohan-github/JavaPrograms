package com.ps.java8;

public class MethodReferencingDemo {
    public static void main(String[] args) {
        //Without Method Reference
        FunctionalInterfaceDemo fd=()->System.out.println("Non Reusable Components");
        fd.singleAbstractMethod();

        //With Method References for reusability
        FunctionalInterfaceDemo fid=Test::PrintName;
        fid.singleAbstractMethod();
    }
    class Test{
        public static void PrintName(){
            System.out.println("Reusable Components ::");
        }
    }
}