package com.ps.java8;

import java.util.Arrays;
import java.util.List;

public class TotalNumOfElementsAndMaxOfList {
    public static void main(String[] args) {
        List<Integer> intList= Arrays.asList(11,2,2,338,12,34,44);

        //Total number of Elements
        System.out.println("Total Number of Elements in List is :: "+intList.stream().count());

        //Max Value
        System.out.println("Max Value in the List is :: "+intList.stream().max(Integer::compare).get());


    }

}
