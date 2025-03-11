package com.ps.dsa.problems_100;

public class MergeSort_2 {
    static int[] arr={13,4,24,41,34,5};//4 13 24   5 34 41
    static int[] temp=new int[arr.length];
    public static void main(String[] args) {
        System.out.println("Before Sorting\n");
        printArray(arr);
        mergeSort(arr,0,arr.length-1);
        System.out.println("\nAfter Sorting\n");
        printArray(arr);
    }

    private static void mergeSort(int[] arr,int low, int high) {
        if(low==high)
            return;
        int mid=(high+low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,high,mid);
    }

    private static void merge(int[] arr, int low, int high, int mid) {
        int left=low;
        int right=mid+1;
        int tempIndex=low;
        while(left<= mid && right <=high){
            if(arr[left] <= arr[right]){
                temp[tempIndex]=arr[left];
                left++;
            }else{
                temp[tempIndex]=arr[right];
                right++;
            }
            tempIndex++;
        }
        while(left<=mid){
            temp[tempIndex]=arr[left];
            tempIndex++;
            left++;
        }
        while(right<=high){
            temp[tempIndex]=arr[right];
            tempIndex++;
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp[i];
        }
    }

    private static void printArray(int[] arr) {
        for(int i : arr)
            System.out.print(" "+i);
    }
}
