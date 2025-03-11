package com.ps.dsa.problems_100;

import java.util.HashSet;
import java.util.Set;

public class NonRepeatingSubString_36 {
    public static void main(String[] args) {
        String input="fakirmohannayak";
        Set<Character> currentword=new HashSet<>();
        int maxLen=0;
        int left=0;
        String longSubStr="";
        for(int right=0 ; right<input.length() ; right++){
            while(currentword.contains(input.charAt(right))){
                currentword.remove(input.charAt(left));
                left++;
            }
            currentword.add(input.charAt(right));
            if(right-left+1>maxLen){
                maxLen=right-left+1;
                longSubStr=input.substring(left,right+1);
            }
        }
        System.out.println("Longest SubString is :: "+longSubStr+" with size "+maxLen);

    }
}
