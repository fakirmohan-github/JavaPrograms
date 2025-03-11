package com.ps.dsa.sorting1;

public class BubbleSort {
    public static void main(String[] args) {
        int[] intArr={3,5,33,10,2,1};
        bubbleSort(intArr);
        for(int i : intArr)
            System.out.print(" " +i);
    }

    private static void bubbleSort(int[] intArr) {
        int n=intArr.length;
        for(int i =0; i<=n-2 ; i++){
            for(int j=0 ; j<n-1 ; j++){
                if(intArr[j] > intArr[j+1]){
                    int temp=intArr[j+1];
                    intArr[j+1]=intArr[j];
                    intArr[j]=temp;
                }
            }
        }
    }
}
