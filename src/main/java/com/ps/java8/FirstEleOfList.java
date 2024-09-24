package com.ps.java8;

import java.util.Arrays;
import java.util.List;

public class FirstEleOfList {
    public static void main(String[] args) {
        List<Integer> intList= Arrays.asList(11,2,3,11,44,3);
        intList.stream().findFirst().ifPresent(System.out::println);
    }
}