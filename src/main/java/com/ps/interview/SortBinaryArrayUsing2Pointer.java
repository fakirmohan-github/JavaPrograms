package com.ps.interview;

public class SortBinaryArrayUsing2Pointer {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 0, 0, 1};
        sortBinaryArrayUsing2Pointer(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void sortBinaryArrayUsing2Pointer(int[] arr) {
         int left=0;
         int right=arr.length-1;
         while(left < right){
             while(arr[left]==0 && left<right)
                 left++;
             while(arr[right] == 1 && left<right)
                 right--;
             if(left<right){
                 arr[left]=0;
                 arr[right]=1;
                 left++;
                 right--;
             }
         }
    }
}
