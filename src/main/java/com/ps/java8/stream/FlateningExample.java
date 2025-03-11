package com.ps.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlateningExample {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(12,43,22,44);
        List<Integer> l2= Arrays.asList(12,3,2,444);
        List<Integer> l3= Arrays.asList(2,4,221,455);

        List<List<Integer>> listOfIntegers = Arrays.asList(l1,l2,l3);

        System.out.println(listOfIntegers);

        List<Integer> listOfAllInts=listOfIntegers.stream()
                .flatMap(x->x.stream())
                .collect(Collectors.toList());

        System.out.println(listOfAllInts);

        List<List<Integer>> listOfIntegers1 = Arrays.asList(l1,l2);

    }
}
