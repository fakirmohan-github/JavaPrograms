package com.ps.y_2026.march;

public class ReverseString {
    public static void main(String[] args) {
        String str="Fakir Mohan Nayak";
        System.out.println("Reverse of "+str+" is "+reverserIt(str));
    }

    private static String reverserIt(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
