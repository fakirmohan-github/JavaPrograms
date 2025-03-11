package com.ps.dsa.problems_100;

public class ConvertDecimalToBinary_92 {
    public static void main(String[] args) {
        int input=13;
        //13/2 - 1 -- 6/2 --0 -- 3/2-- 1 --1/2 --1
        //expected o/p is 1101
        StringBuilder result=convertToBinary(input);
        System.out.println("Binary Value is :: "+result);
    }

    private static StringBuilder convertToBinary(int input) {
        StringBuilder result=new StringBuilder();
        while(input!=0) {
            result = result.append(input % 2);
            input = input / 2;
        }
        return result.reverse();
    }
}
