package com.ps.dsa.problems_100;

public class ReverseInteger_91 {
    static int reverse =0;
    public static void main(String[] args) {
        int input=123434;
        System.out.println("Before Reversing :: "+input);
        int reversed=reverseInteger(input);
        System.out.println("After Reversing :: "+reversed);
    }

    private static int reverseInteger(int input) {
        int reversed=0;
        while(input!=0){
            reversed=reversed*10+input%10;
            input=input/10;
        }
        return reversed;
    }

}
