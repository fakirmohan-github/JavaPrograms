package com.ps.dsa.arrays_practice;

public class PossibleSubArrayOfTragetSum {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,1,1,5,2};
        int target = 4;
        printTargetArrays(arr,0,0,target);
    }

    private static void printTargetArrays(int[] arr, int s, int e,int target) {
        if(e==arr.length)
            return;
        else if(s>e){
            printTargetArrays(arr,0,e+1,target);
        }
        else{// Calculate sum of the current subarray
            int sum = 0;
            for (int i = s; i <= e; i++) {
                sum += arr[i];  // Add each element to the sum
            }

            // If the sum matches the target, print the subarray
            if (sum == target) {
                System.out.print("[");
                for (int i = s; i <= e; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println("]");  // Print target sum info
            }

            // Recur to find the next subarray with a new starting index
            printTargetArrays(arr, s + 1, e, target);
        }
    }
}
