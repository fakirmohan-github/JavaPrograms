package com.ps.y_2026.march;

import java.util.HashSet;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        String str="ababcabcadab";
        System.out.println("Length of the longest sub string is "+findLongestUniqueSubStrLen(str));
    }
    private static int findLongestUniqueSubStrLen(String str) {
        int left=0;
        int maxLen =0;
        HashSet<Character> result = new HashSet<>();
        for(int right=0 ; right<str.length() ; right++){
            while(result.contains(str.charAt(right))){
                result.remove(str.charAt(left));
                left++;
            }
            result.add(str.charAt(right));
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}
