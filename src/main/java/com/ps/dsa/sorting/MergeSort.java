package com.ps.dsa.sorting;

/*

Divide and Merge.

Steps of the Merge Sort Algorithm:
Divide: If the array has more than one element, split the array into two halves.
Recursively sort: Recursively sort both halves of the array.
Merge: Once the halves are sorted, merge them back together to produce a sorted array.


*/

public class MergeSort {
    static int[] arr={2,3,1,4,0};
    static int n=arr.length-1;
    static int[] temp=new int[arr.length];
    public static void main(String[] args) {
        mergeSort(arr,0,n);
        for (int i:arr)
            System.out.print(" "+i);
    }
    private static void mergeSort(int[] arr,int low, int high) {
        if(low==high)
            return;
        int mid=(low+high)/2;

        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,high,mid);

    }
    //merging 2 sorted array here
    private static void merge(int[] arr, int low, int high, int mid) {
        int left=low;
        int right=mid+1;
        int tempindex=low;
        while(left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[tempindex] = arr[left];
                left++;
            } else {
                temp[tempindex] = arr[right];
                right++;
            }
            tempindex++;
        }
        while(left<=mid){
            temp[tempindex]=arr[left];
            left++;
            tempindex++;
        }
        while(right<=high){
            temp[tempindex]=arr[right];
            right++;
            tempindex++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp[i];
        }
    }
}
