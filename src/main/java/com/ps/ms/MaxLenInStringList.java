package com.ps.ms;

import java.util.Arrays;
import java.util.List;

public class MaxLenInStringList {
    public static void main(String[] args) {
        List<String> strList= Arrays.asList("spider","man","superman","spiderman");
        String longStr=strList.stream().reduce((x,y)->x.length()>y.length() ? x:y).get();
        System.out.println("Longest String is "+longStr);
    }
}
