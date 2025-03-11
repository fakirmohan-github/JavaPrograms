package com.ps.dsa.problems_100;

public class MergeSort {
    static int[] arr = {13, 4, 24, 41, 34, 5};//4 13 24   5 34 41
    static int[] tempArr=new int[arr.length];

    public static void main(String[] args) {
        System.out.println("Before Sorting");
        printArray(arr);
        mergeSort(arr,0,arr.length-1);
        System.out.println("\nAfter Sorting");
        printArray(arr);
    }

    private static void mergeSort(int[] arr, int l, int h) {
        if(l==h)
            return;
        int mid=(l+h)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,h);
        conqer(arr,l,h,mid);
    }

    private static void conqer(int[] arr, int l, int h, int mid) {
        int left=l;
        int right=mid+1;
        int tempIndex=l;
        while(left<=mid && right<=h){
            if(arr[left]<=arr[right]){
                tempArr[tempIndex]=arr[left];
                left++;
            }else{
                tempArr[tempIndex]=arr[right];
                right++;
            }
            tempIndex++;
        }
        while(left <= mid) {
            tempArr[tempIndex] = arr[left];
            tempIndex++;
            left++;
        }
        while (right<=h){
            tempArr[tempIndex]=arr[right];
            tempIndex++;
            right++;
        }
        for(int i=l;i<=h;i++){
            arr[i]=tempArr[i];
        }
    }

    private static void printArray(int[] arr) {
        for(int i:arr){
            System.out.print(" "+i);
        }
    }
}