package com.ps.dsa.arrays;

public class PossibleSubArrays {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 7, 9};
        subArrray(arr, 0, 0);
    }

    public static void subArrray(int[] arr, int s, int e) {
        if (e == arr.length) {
            return;
        } else if (s > e) {
            subArrray(arr, 0, e + 1);
        } else {
            System.out.print(" [ ");
            for (int i = s; i < e; i++) {
                System.out.print(arr[i] + " , ");
            }
            System.out.println(arr[e] + " ] ");
            subArrray(arr, s + 1, e);
        }
        return;
    }
}

