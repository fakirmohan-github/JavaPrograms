package com.ps.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortIntegerList {
    public static void main(String[] args) {
        List<Integer> intlist= Arrays.asList(1,23,4,55,2,66);
        //Sorting in default/ascending order
        intlist.stream().sorted().forEach(System.out::println);
        //Sorting in Descending Order
        intlist.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }
}
