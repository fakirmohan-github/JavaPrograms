package com.ps.dsa.problems_100;

import java.util.stream.Collectors;

public class AnagramCheck_32 {
    public static void main(String[] args) {
        String input1="throw";
        String input2="worths";
        checkAnagram(input1,input2);
    }

    private static void checkAnagram(String input1, String input2) {
        String sorted1= input1.chars()
                .mapToObj(ch->(char)ch)
                .map(Character::toLowerCase)
                .sorted(Character::compareTo)
                .map(String::valueOf)
                .collect(Collectors.joining());
        String sorted2= input2.chars()
                .mapToObj(ch->(char)ch)
                .map(Character::toLowerCase)
                .sorted(Character::compareTo)
                .map(String::valueOf)
                .collect(Collectors.joining());
        if(sorted1.equalsIgnoreCase(sorted2)){
            System.out.println("Given Strings are Anagram");
        }else
            System.out.println("Given Strings are not anagram");
    }
}
