package com.ps.dsa.problems_100;

public class BubbleSort_1 {
    public static void main(String[] args) {
        int[] intarr={1,5,3,2,6};
        System.out.println("Before Sorting\n");
        printArray(intarr);
        bubbleSort(intarr);
        System.out.println("\nAfter Sorting\n");
        printArray(intarr);
    }

    private static void bubbleSort(int[] intarr) {
        int n= intarr.length;
        for(int i=0 ; i<n-2 ; i++){
            for(int j=0 ; j<n-2 ;j++){
                if(intarr[j]>intarr[j+1]) {
                    int temp = intarr[j + 1];
                    intarr[j + 1] = intarr[j];
                    intarr[j] = temp;
                }
            }
        }
    }

    private static void printArray(int[] intarr) {
        for(int i : intarr)
            System.out.print(" "+i);
    }
}
