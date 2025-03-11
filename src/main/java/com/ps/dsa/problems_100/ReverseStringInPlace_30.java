package com.ps.dsa.problems_100;

public class ReverseStringInPlace_30 {
    public static void main(String[] args) {
        String input="Fakir Mohan Nayak";
        reverseMe(input);
    }

    private static void reverseMe(String input) {
        StringBuilder result=new StringBuilder();
        for(int i=input.length()-1 ; i>=0 ; i--){
            result.append(input.charAt(i));
        }
        System.out.println(result);
    }
}
