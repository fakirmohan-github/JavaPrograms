package com.ps.java8;

import java.util.Arrays;
import java.util.List;

public class SumOfInteger {
    public static void main(String[] args) {
        List<Integer> intList= Arrays.asList(1,3,4,1,2);
        Integer sum=intList.stream().reduce((i,j)->i+j).orElse(0);
        System.out.println(sum);
    }
}
