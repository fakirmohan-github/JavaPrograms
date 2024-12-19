package com.ps.dsa.string;

import java.util.HashSet;

public class LongestUniqueSubString {
    public static void main(String[] args) {
        String str="ababcabcdaab";
        int longestSubStr=findLongestSubString(str);
        System.out.println("Longest Substring Length is : "+longestSubStr);
    }

    private static int findLongestSubString(String str) {
        int left = 0;
        int maxLen=0;
        HashSet<Character> window=new HashSet<>();
        for(int right=0 ; right<str.length() ; right++){
            while(window.contains(str.charAt(right))){
                window.remove(str.charAt(left));
                left++;
            }
            window.add(str.charAt(right));
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}
