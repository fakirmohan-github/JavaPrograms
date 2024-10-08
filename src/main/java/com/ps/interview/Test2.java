package com.ps.interview;

import java.util.Arrays;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {
        /*
        Given a list of Integer , Find the first and second maximum

Eg:- Input :- { 7 , 10 , 11 , 12 , 4 , 5 }

Output:- {  12 , 11 }
         */

        List<Integer> integerList= Arrays.asList(7 , 10 , 11 , 12 , 4 , 5);
        Integer first=integerList.stream().max(Integer::compare).get();
        Integer second=integerList.stream().filter(num->num!=first).max(Integer::compare).get();
        System.out.println("First : "+first +" Second :"+second);
    }

}