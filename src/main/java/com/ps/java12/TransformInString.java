package com.ps.java12;

import java.util.Optional;

public class TransformInString {
    public static void main(String[] args) {
        System.out.println(Optional.of("MYNAMEISKHAN".transform(str -> str.substring(2))).get());
    }
}
