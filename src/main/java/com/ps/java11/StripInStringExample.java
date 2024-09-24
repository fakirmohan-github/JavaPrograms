package com.ps.java11;

public class StripInStringExample {
    public static void main(String[] args) {
        String str=" Te st ";
        System.out.println(str.strip().replace(" ","@"));
        System.out.println(str.stripLeading().replace(" ","@"));
        System.out.println(str.stripTrailing().replace(" ","@"));
    }
}
