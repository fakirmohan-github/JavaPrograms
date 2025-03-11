package com.ps.dsa.problems_100;

import java.util.Arrays;

public class MissingNumberInIntegerArray_15 {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6};
        int result=findMissingNumber(arr);
        System.out.println("Missing Number is : "+result);
    }

    private static int findMissingNumber(int[] arr) {
        int n=arr.length+1;
        int expectedSum=(n*(n+1))/2;
        System.out.println("Expected Sum :"+expectedSum);
        int actualsum= Arrays.stream(arr).sum();
        System.out.println("Actual Sum :"+actualsum);
        return expectedSum-actualsum;
    }
}
