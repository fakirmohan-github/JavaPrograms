package com.ps.java8;

import java.util.Arrays;

public class ReverseStringWithTitleCase {
    //Output=You Are How Hi
    public static void main(String[] args) {
        String inputString = "Hi how are you";


        String output = Arrays.stream(inputString.split(" "))
                .map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1) + ' ')
                .reduce((first, second) -> second + first)
                .orElse("");
        System.out.println("Output :: " + output);
    }

}
