package com.ps.dsa.problems_100;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDupNumbersInArray_16 {
    public static void main(String[] args) {
        int[] arr={1,3,2,9,1,2,3,9,4,5,4};
        findDupNumbers(arr);
    }

    private static void findDupNumbers(int[] arr) {
        List<Integer> dupList= Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(m->m.getValue()>1)
                .map(m->m.getKey())
                .collect(Collectors.toList());
        dupList.stream().forEach(System.out::println);
    }
}