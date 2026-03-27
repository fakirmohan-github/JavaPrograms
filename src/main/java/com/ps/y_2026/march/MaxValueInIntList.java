package com.ps.y_2026.march;

import java.util.Arrays;
import java.util.List;

public class MaxValueInIntList {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,3,2,33,2,1);
        integerList.stream()
                .reduce((x,y)->x>y?x:y)
                .ifPresent(i->System.out.println("Max value in this list is "+i));

        integerList.stream()
                .max(Integer::compareTo)
                .ifPresent(i->System.out.println("Max ::"+i));
    }
}
