package com.ps.ms;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1="Fakir";
        String s2="kirFa";

        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println("Are Anagram :: "+ Arrays.equals(ch1,ch2));

    }
}
