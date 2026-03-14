package com.ps.y_2026.march;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        int[] intArr={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int currentSum=intArr[0];
        int maxSum=intArr[0];
        for(int i=1 ; i<intArr.length ; i++){
            currentSum=Math.max(intArr[i],currentSum+intArr[i]);
            maxSum=Math.max(maxSum,currentSum);
        }
        System.out.println("Max Sum is "+maxSum);
    }
}
