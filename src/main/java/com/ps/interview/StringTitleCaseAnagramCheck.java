package com.ps.interview;

import java.util.Arrays;

public class StringTitleCaseAnagramCheck {

    public static void main(String[] args) {
        String s1="JhonRobertSteveSam";
        String s2="SteveRobertJhonSam";

        String[] s1Arr=s1.split("(?=[A-Z])");
        String[] s2Arr=s2.split("(?=[A-Z])");

        System.out.println("Both the Strings are Anagram :: "+araAnagram(s1Arr,s2Arr));

    }

    private static String araAnagram(String[] s1Arr, String[] s2Arr) {
        if(s1Arr.length != s2Arr.length){
            return "False";
        }else{
            Arrays.sort(s1Arr);
            Arrays.sort(s2Arr);
            if(Arrays.compare(s1Arr,s2Arr)==0){
                return "True";
            }else return "False";
        }
    }
}
