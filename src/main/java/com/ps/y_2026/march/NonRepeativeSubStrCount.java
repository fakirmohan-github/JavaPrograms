package com.ps.y_2026.march;

import java.util.HashSet;

public class NonRepeativeSubStrCount {
    public static void main(String[] args) {
        String str="abcdbcd";
        System.out.println(calculateNonRepeativeStrCount(str));
    }

    private static int calculateNonRepeativeStrCount(String str) {
        int left=0;
        int count =0;
        HashSet<Character> window = new HashSet<>();
        for(int right=0; right<str.length() ; right++){
            while(window.contains(str.charAt(right))){
                window.remove(str.charAt(left));
                left++;
            }
            window.add(str.charAt(right));
            count=count+(right-left+1);
        }
        return count;
    }
}
