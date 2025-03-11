package com.ps.ms;

public class ReverseStringUsingRecursion {
    public static void main(String[] args) {
        String input ="Fakir Mohan";
        String result=reverseMeusingRecursion(input);
        System.out.println("Reversed String is : "+result);
    }

    private static String reverseMeusingRecursion(String input) {
        if(input.isEmpty())
            return input;
        return reverseMeusingRecursion(input.substring(1))+input.charAt(0);
    }
}
