package com.ps.ms;

public class ConvertCharsCase {
    public static void main(String[] args) {
        String input="Fakir Mohan Nayak";
        StringBuilder sb= new StringBuilder();
        for(char ch : input.toCharArray()){
            if(Character.isLowerCase(ch))
                sb.append(Character.toUpperCase(ch));
            else
                sb.append(Character.toLowerCase(ch));
        }
        System.out.println("Result "+sb);
    }
}
