package com.ps.dsa.arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr= {1,3,5,2,6};
        int k=2;
        //Expected O/P -- 2 6 1 3 5
        System.out.println("Array Before "+k+" rotation ");
        for(int i:arr)
            System.out.print(" "+i);
        rotateArray(arr,k);
        System.out.println("\nArray After "+k+" rotation ");
        for(int i:arr)
            System.out.print(" "+i);
    }

    private static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k=k%n;
        reverse(arr,0,n-1);
        System.out.println("\n After whole array Reverse ");
        for(int i:arr)
            System.out.print(" "+i);
        reverse(arr,0,k-1);
        System.out.println("After 1st part of Array Reverse ");
        for(int i:arr)
            System.out.print(" "+i);
        reverse(arr,k,n-1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }
}
