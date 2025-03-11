package com.ps.ms;

public class ReverseStringUsingIterator {
    public static void main(String[] args) {
        String input = "Fakir Mohan";
        StringBuilder result= new StringBuilder();
        for(int i=input.length()-1 ; i>=0 ; i--){
            result.append(input.charAt(i));
        }
        System.out.println("reverse String is : "+result);
    }
}
