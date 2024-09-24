package com.ps.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNumber {
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(2, 1, 7, 6, 4, 2, 9);
        getSecondHighestNum(integerList);
    }

    private static void getSecondHighestNum(List<Integer> integerList) {
        System.out.println(integerList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst());
        //System.out.println(integerList.stream().sorted().skip(integerList.size()-2).findFirst());
    }
}
