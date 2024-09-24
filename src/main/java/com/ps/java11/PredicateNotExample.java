package com.ps.java11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateNotExample {
    public static void main(String[] args) {
        List<Integer> arrList=Arrays.asList(12,13,33,22,1,90);
        //Find Even NUmber Using Predicate
        arrList.stream().filter(PredicateNotExample::isEven).forEach(System.out::println);
        //Finding Odd Number Using Predicate Not
        arrList.stream().filter(Predicate.not(PredicateNotExample::isEven)).forEach(System.out::println);
    }
    private static boolean isEven(Integer integer) {
        return integer%2==0;
    }
}
