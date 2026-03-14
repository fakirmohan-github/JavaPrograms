package com.ps.y_2026.march;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr= {1,3,5,2,6};
        int k=2;
        int n=arr.length;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        for(int i : arr)
            System.out.print(i+" ");
    }

    private static void reverse(int[] arr, int left, int right) {
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}
