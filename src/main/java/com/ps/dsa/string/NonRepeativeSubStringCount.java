package com.ps.dsa.string;

import java.io.*;
import java.util.LinkedList;

public class NonRepeativeSubStringCount {
    public static void main(String[] args) throws IOException {
        String s = "abcdbcd";
        System.out.println("Result is "+findSubstringsCount(s));
    }
    public static int findSubstringsCount(String s) {
        LinkedList<Character> current = new LinkedList<>();
        int count=0;
        int start=0;
        for(int end=0 ; end < s.length() ; end++){
            while (current.contains(s.charAt(end))) {
                current.removeFirst();
                start++;
            }
            current.add(s.charAt(end));
            count=count+(end-start+1);
        }
        return count;
    }
}
