package com.ps.y_2026.march;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(11, 12, 11, 13, 11, 44, 44, 33, 20);
        Set<Integer> dupStream = findDuplicates(numList);
        System.out.println("Duplicate Elements are");
        dupStream.stream().forEach(n -> System.out.println(n));
        //using frequency method
        System.out.println("Finding Duplicate Elements using Frequency Method :: " + findDuplicatesUsingFrequencyMethod(numList));
    }
    public static Set<Integer> findDuplicates(List<Integer> integers){
        HashSet<Integer> tempSet = new HashSet<>();
        return integers.stream()
                .filter(i->!tempSet.add(i))
                .collect(Collectors.toSet());
    }

    public static Set<Integer> findDuplicatesUsingFrequencyMethod(List<Integer> integers){
        return integers.stream()
                .filter(num-> Collections.frequency(integers,num)>1)
                .collect(Collectors.toSet());

    }
}