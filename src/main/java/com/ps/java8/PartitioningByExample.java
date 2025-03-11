package com.ps.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByExample {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(15,24,33,12,19);
        Map<Boolean,List<Integer>> result=numbers.stream()
                .collect(Collectors.partitioningBy(n->n%2==0));
        System.out.println(result);
    }
}
