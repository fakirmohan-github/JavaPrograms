package com.ps.java8;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateElementsJava8 {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(11, 12, 11, 13, 11, 44, 44, 33, 20);


        Set<Integer> dupStream = findDuplicates(numList);
        System.out.println("Duplicate Elements are");
        dupStream.stream().forEach(n -> System.out.println(n));
        //using frequency method
        System.out.println("Finding Duplicate Elements using Frequency Method :: " + findDuplicatesUsingFrequencyMethod(numList));
    }

    private static Set<Integer> findDuplicatesUsingFrequencyMethod(List<Integer> numList) {
        return numList.stream().filter(num -> Collections.frequency(numList, num) > 1).collect(Collectors.toSet());
    }

    private static Set<Integer> findDuplicates(List<Integer> numList) {
        HashSet<Integer> tempSet = new HashSet<>();
        return numList.stream().filter(n -> !tempSet.add(n)).collect(Collectors.toSet());
    }
}
