package com.ps.ms;

import java.util.Arrays;
import java.util.List;

public class LongestLenStr {
    public static void main(String[] args) {

        //With Stream
        List<String> strList= Arrays.asList("spider","ant","man","spiderman","antman");
        System.out.println(strList.stream().reduce((first,sec)->first.length() > sec.length() ? first:sec).get());

        //Without Stream
        findLongestStrInList(strList);
    }

    private static void findLongestStrInList(List<String> strList) {
        for(int i=0 ; i<strList.size() ; i++){

        }
    }
}
