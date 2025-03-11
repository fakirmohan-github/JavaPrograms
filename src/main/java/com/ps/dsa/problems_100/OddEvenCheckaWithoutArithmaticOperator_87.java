package com.ps.dsa.problems_100;

public class OddEvenCheckaWithoutArithmaticOperator_87 {
    public static void main(String[] args) {
        int input=230;
        //If LSB(Least Significat Bit) of number is 0 then even if it is 1 then number is odd.
        if((input&1)==0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }
}
