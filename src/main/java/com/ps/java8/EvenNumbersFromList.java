package com.ps.java8;

import java.util.Arrays;
import java.util.List;


public class EvenNumbersFromList {
    public static void main(String[] args) {
        List<Integer> strList= Arrays.asList(12,1,22,32,11);
        strList.stream().filter(n -> n%2 == 0).forEach(System.out::println);
    }
}