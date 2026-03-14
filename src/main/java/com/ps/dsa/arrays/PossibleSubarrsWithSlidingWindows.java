package com.ps.dsa.arrays;

public class PossibleSubarrsWithSlidingWindows {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,1,1,5,2};
        int target = 4;
        printSubArraysWithTargetSum(arr,target);
    }

    private static void printSubArraysWithTargetSum(int[] arr, int target) {
        int left=0;
        int sum=0;
        for(int right=0 ; right < arr.length ; right++) {
            sum=sum+arr[right];
            while(sum>target && left<=right){
                sum=sum-arr[left];
                left++;
            }
            if(sum==target){
                System.out.print("[");
                for(int i=left ; i<=right ; i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.print("] ");
            }
        }
    }
}
