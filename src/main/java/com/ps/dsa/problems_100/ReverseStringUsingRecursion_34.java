package com.ps.dsa.problems_100;

public class ReverseStringUsingRecursion_34 {
    public static void main(String[] args) {
        String input ="fakir mohan";
        String reverse=reverseUsingRecursion(input);
        System.out.println("Reversed String is : "+reverse);
    }
    private static String reverseUsingRecursion(String input) {
        if(input.isEmpty())
            return input;
        return reverseUsingRecursion(input.substring(1))+input.charAt(0);
    }
}
