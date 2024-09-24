package com.ps.java8;

import java.util.Arrays;
import java.util.List;

public class StartingWith1InList {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(11, 3, 10, 21, 111);
        integerList.stream().map(s -> s + "").filter(i -> i.startsWith("1")).forEach(System.out::println);
    }
}
