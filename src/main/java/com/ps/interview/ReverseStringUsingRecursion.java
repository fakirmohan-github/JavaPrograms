package com.ps.interview;

public class ReverseStringUsingRecursion {
    public static void main(String[] args) {
        String name = "Fakir Mohan Nayak";
        String reversedString = reverseUsingRecursion(name);
        System.out.println(reversedString);
    }

    public static String reverseUsingRecursion(String str) {
        // Base case: if the string is empty or has one character
        if (str.isEmpty()) {
            return str;
        }
        // Recursive case: take the last character and append it to the reversed substring
        return str.charAt(str.length() - 1) + reverseUsingRecursion(str.substring(0, str.length() - 1));
    }
}
