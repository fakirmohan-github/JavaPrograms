package com.ps.dsa.problems_100;

public class LongPallindromincSubStr_37 {
    public static void main(String[] args) {
        String input="fakairmohannayak";
        int left=0;
        int maxLen=0;
        String currentStr="";
        int right=input.length()-1;
        findMaxLenPallindromeSubStr(input,left,right);
    }
    private static void findMaxLenPallindromeSubStr(String input, int left, int right) {
        while(left<=right){
            if(input.charAt(left)!=input.charAt(right)){
                findMaxLenPallindromeSubStr(input,left,right-1);
            }
            left++;
            right--;
        }
    }
}
