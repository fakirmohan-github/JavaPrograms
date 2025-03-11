package com.ps.dsa.arrays;

//Fina a optimal Solution

public class PossibleSubArraysOfTargetSum {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,1,1,5,2};
        int target = 4;
        printSubArraysWithTargetSum(arr,0,0,target);
    }
    private static void printSubArraysWithTargetSum(int[] arr, int s, int e, int target) {
        if(e==arr.length)
            return;
        else if(s>e){
            printSubArraysWithTargetSum(arr,0,e+1,target);
        }else{
            int sum=0;
            for(int i=s ; i<=e ; i++){
                sum=sum+arr[i];
            }
            if(sum==target){
                System.out.print("[");
                for(int i=s ; i<=e ; i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println("]");
            }
            printSubArraysWithTargetSum(arr,s+1,e,target);
        }
    }
}
