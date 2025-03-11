package com.ps.java8.stream;

import java.util.Arrays;
import java.util.List;

public class MaxAndMinExample {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10,23,11,334,234);
        int max=intList.stream().max(Integer::compare).get();
        System.out.println("Maximum Value is :: "+max);
        int min=intList.stream().min(Integer::compare).get();
        System.out.println("Minimum Value is :: "+min);
    }
}
