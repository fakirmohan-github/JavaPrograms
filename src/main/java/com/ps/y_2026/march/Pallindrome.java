package com.ps.y_2026.march;

public class Pallindrome {
    public static void main(String[] args) {
        String str= "level";
        System.out.println(checkForPallindrome(str));
    }

    private static boolean checkForPallindrome(String str) {
        int start=0;
        int end = str.length()-1;
        while(start<end){
            if(str.charAt(start) != str.charAt(end))
                return  false;
            start++;
            end--;
        }
        return true;
    }
}
