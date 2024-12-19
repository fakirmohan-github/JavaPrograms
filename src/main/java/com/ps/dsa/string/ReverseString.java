package com.ps.dsa.string;

public class ReverseString {
    public static void main(String[] args) {
        String str="Reverse Me";

        //Using String Builder
        StringBuilder sb=new StringBuilder(str);
        System.out.println("Reversed String is : "+sb.reverse().toString());
    }
}
