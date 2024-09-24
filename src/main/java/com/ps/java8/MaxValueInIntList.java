package com.ps.java8;

import java.util.Arrays;
import java.util.List;

public class MaxValueInIntList {
    public static void main(String[] args) {
        List<Integer> intList= Arrays.asList(12,12,11,23,143,23,43,143);
        Integer maxNum=intList.stream().max(Integer::compare).get();
        System.out.println("Maximum Number is "+maxNum);
    }
}
