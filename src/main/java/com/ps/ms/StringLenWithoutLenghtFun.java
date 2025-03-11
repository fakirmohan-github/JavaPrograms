package com.ps.ms;

public class StringLenWithoutLenghtFun {
    public static void main(String[] args) {
        String s="Fakir Mohan Nayak";
        int len=0;
        for(int i : s.toCharArray())
            len++;
        System.out.println("Length of the String :: "+len);
    }
}
