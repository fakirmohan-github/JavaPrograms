package com.ps.dsa.problems_100;

import java.util.regex.Matcher;

public class StringWithOnlyDigitCheck_38 {
    public static void main(String[] args) {
        String input="1232443f";
        checkIfOnlyDigits(input);
    }
    private static void checkIfOnlyDigits(String input) {
        boolean isDigitOnly=input.chars().allMatch(Character::isDigit);
        if(isDigitOnly)
            System.out.println("Input contains only digits");
        else
            System.out.println("Input contains other than digit as well");
    }
}
