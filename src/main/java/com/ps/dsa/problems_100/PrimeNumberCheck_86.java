package com.ps.dsa.problems_100;

public class PrimeNumberCheck_86 {
    public static void main(String[] args) {
        int input=7;
        boolean isPrime=true;
        for(int i=2 ; i<=input/2 ; i++){
            if(input%i==0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}
