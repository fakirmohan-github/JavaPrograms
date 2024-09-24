package com.ps.java13;

public class FormattedInString {
    public static void main(String[] args) {
        //before java 13 formatted we were achieving by printf nad \n like below
        System.out.printf("My Name is %s and age is %d\n","Fakir",31);
        //Using formatted method
        System.out.println("My Name is %s and age is %d".formatted("Mohan",31));
    }
}
