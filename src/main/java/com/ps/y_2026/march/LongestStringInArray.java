package com.ps.y_2026.march;

import java.util.Arrays;
import java.util.List;

public class LongestStringInArray {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("Fakir","Mohan","Chintu","Nayak");
        input.stream()
                .reduce((x,y)->x.length()>y.length()?x:y)
                .ifPresent(System.out::println);
    }
}
