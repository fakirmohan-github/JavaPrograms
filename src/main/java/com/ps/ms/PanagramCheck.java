package com.ps.ms;

import java.util.HashSet;
import java.util.Set;

/*

A pangram is a sentence that contains every letter of the alphabet at least once.
For example, the sentence "The quick brown fox jumps over the lazy dog"
is a pangram because it includes all 26 letters of the English alphabet.

*/
public class PanagramCheck {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        String input1="Fakir Mohan Nayak";
        isPangram(input);
    }

    private static void isPangram(String input) {
        input=input.toLowerCase().replaceAll("[^a-z]","");
        char[] charArray=input.toCharArray();
        Set<Character> characterSet=new HashSet<>();
        for(int i=0 ; i< charArray.length ; i++){
            characterSet.add(charArray[i]);
        }
        if(characterSet.size()==26){
            System.out.println("Given String is Pangram");
        }else{
            System.out.println("Given String is not a Pangram");
        }
    }
}
