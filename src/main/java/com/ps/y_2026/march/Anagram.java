package com.ps.y_2026.march;

import java.util.stream.Collectors;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "stenlia";
        System.out.println("Both are Anagram "+isAnagram(str1,str2));
    }

    private static boolean isAnagram(String str1, String str2) {
        String sortedStr1=str1.chars()
                .mapToObj(ch->(char)ch)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining());

        String sortedStr2 = str2.chars()
                .mapToObj(ch->(char)ch)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining());
        if(sortedStr1.equalsIgnoreCase(sortedStr2))
            return true;
        else
            return false;
    }
}
