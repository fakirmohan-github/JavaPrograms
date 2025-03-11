package com.ps.ms;

public class RemoveSpecifiCCharsInString {
    public static void main(String[] args) {
        String s="Fakir Mohan Nayak";
        String removeEle="[an]";
        String result=s.replaceAll(removeEle,"");
        System.out.println("Result "+result);
    }
}
