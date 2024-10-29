package com.ps.java8;

import java.util.Arrays;
import java.util.List;

public class LongestStringInArray {
    public static void main(String[] args) {
        List<String> strArr= Arrays.asList("Fakir","Mohan Nayak","Chintu");
        String longestStr=strArr.stream().reduce((first,sec)->first.length() > sec.length() ? first : sec)
                .get();
        System.out.println("Longest String is "+longestStr);
    }
}
