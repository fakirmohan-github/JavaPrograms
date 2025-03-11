package com.ps.collection;

/*

Immutable List or Unmodifiable List
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnModifiableList {

    public static void main(String[] args) {
        List<Integer> intList =new ArrayList<>();
        intList.add(2);
        intList.add(3);
        intList.stream().forEach(System.out::println);
        //List<Integer> intList = Arrays.asList(1,3,2,44,23);//Its Unmodifiable List
        //intList.add(100);
        List<Integer> unModIntList= Collections.unmodifiableList(intList);
        unModIntList.add(200);//Here we will get exception
        unModIntList.stream().forEach(System.out::println);
    }
}
