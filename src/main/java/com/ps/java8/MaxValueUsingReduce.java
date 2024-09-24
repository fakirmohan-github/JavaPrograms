package com.ps.java8;


import java.util.Arrays;
import java.util.List;

public class MaxValueUsingReduce {
    public static void main(String[] args) {
        List<Integer> intList= Arrays.asList(1,2,3,22,3,11,333,8);
        Integer maxNum=intList.stream().reduce((a,b)->a>b?a:b).orElse(null);
        System.out.println(maxNum);
    }
}
