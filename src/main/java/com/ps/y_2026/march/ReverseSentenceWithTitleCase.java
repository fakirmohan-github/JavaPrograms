package com.ps.y_2026.march;

import java.util.Arrays;

public class ReverseSentenceWithTitleCase {
    //Output=You Are How Hi
    public static void main(String[] args) {
        String inputString = "Hi how are you";
        System.out.println(Arrays.stream(inputString.split(" "))
                        .map(s->Character.toUpperCase(s.charAt(0))+s.substring(1)+" ")
                .reduce((s1,s2)->s2+s1)
                .get());

    }
}
