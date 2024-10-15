package com.ps.interview;

public class ReverseStringUsingRecurssion {
    public static void main(String[] args) {
        String name="Fakir Mohan Nayak";
        char[] nameArr=name.toCharArray();
        StringBuilder reversedString=new StringBuilder();
        int size=nameArr.length;
        reverseUsingRecurssion(nameArr,reversedString,size);
        System.out.println(reversedString);
    }

    public static void reverseUsingRecurssion(char[] nameArr,StringBuilder reversedString,int size ){
        if(size>0){
            reversedString.append(nameArr[size-1]);
            size--;
            reverseUsingRecurssion(nameArr,reversedString,size);
        }
    }

}
