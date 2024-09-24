package com.ps.java8;

import java.util.function.BiConsumer;

public class LambdaExpressionDemo {

    //Sum of 2 integer using Lambda Expression
    public static void main(String[] args) {
        //Before Java 8
        //int result =add(5,6);
        //System.out.println("Sum is :: "+result);

        //After Java 8
        BiConsumer<Integer,Integer> bc= (a,b) -> System.out.println(a+b);
        bc.accept(5,6);

        //After Java 8
        BiConsumer<Integer,Integer> bc1= (a,b) -> {
            int c=a+b;
            System.out.println("Sum is :: "+c);
        };
        bc1.accept(5,6);
        }
    /*public static int add(int a,int b){
        return a+b;
    }*/
}
