package com.ps.java9;

import java.util.ArrayList;
import java.util.List;

public class ListOfExample {
    public static void main(String[] args) {
        //Creating Immutable List
        List<String> arrList=List.of("Fakir","Mohan","Nayak");
        arrList.forEach(System.out::println);
        //We can not add any string to this immutable list
        arrList.add("CanNotAdd");
    }
}
