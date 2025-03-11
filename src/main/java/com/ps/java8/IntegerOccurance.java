package com.ps.java8;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntegerOccurance {
    public static void main(String[] args) {
        int[] arr={1,2,1,3,4};
        IntStream.of(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((k,v)->System.out.println(k+" occurs "+v+" times."));
    }
}
