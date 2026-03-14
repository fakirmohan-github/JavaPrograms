package com.ps.dsa.arrays;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        int[] intArr={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int startIndex=0;
        int endIndex=0;
        int tempStart=0;
        int currentSum=intArr[0];
        int maxSum=intArr[0];
        for(int i=1 ; i< intArr.length ; i++){
            if(intArr[i]>currentSum+intArr[i]){
                currentSum=intArr[i];
                tempStart=i;
            }else
                currentSum=currentSum+intArr[i];
            if(maxSum<currentSum){
                maxSum=currentSum;
                startIndex=tempStart;
                endIndex=i;

            }
        }
        System.out.println("Max Sum Sub Array is "+maxSum);
        for(int i=startIndex ; i<=endIndex ; i++){
            System.out.print(intArr[i]+" ");
        }
    }
}
