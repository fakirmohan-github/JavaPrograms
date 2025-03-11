package com.ps.dsa.sorting;

/*

Takes an element and places it in its correct position


23
23 4
4 23
4 23 24 1


*/

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr= {23,4,24,1,66,5};
        int n= arr.length;
        for(int i=1 ; i<n ; i++){
            int j=i;
            while(j>0 && arr[j] < arr[j-1]){
                swapForInsertionSort(arr,j,j-1);
                j--;
            }
        }
        for(int i : arr)
            System.out.print(" "+i);
    }

    private static void swapForInsertionSort(int[] arr, int j, int i) {
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}
