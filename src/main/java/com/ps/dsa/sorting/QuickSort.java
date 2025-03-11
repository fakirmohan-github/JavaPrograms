package com.ps.dsa.sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] intarr={1,3,4,5,2};
        quickSort(intarr,0, intarr.length-1);
    }

    private static void quickSort(int[] intarr, int begin, int end) {
        if(begin < end){
            int partition=findPartition(intarr,begin,end);
            quickSort(intarr,begin,partition-1);
            quickSort(intarr,partition+1,end);
        }
    }
    private static int findPartition(int[] intarr, int begin, int end) {
        int pivot=intarr[end];
        int i=begin-1;
        for(int j=begin ; j<end ; j++){
            if(intarr[j] < pivot){
                i++;
                //swap(intarr,i,j);
            }
        }
return 0;
    }
}
