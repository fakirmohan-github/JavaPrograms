package com.ps.dsa.problems_100;

public class ReverseArrayInPlace_9 {
    public static void main(String[] args) {
        int[] arr={3,5,4,2,1,6,7};
        System.out.println("Before Reverse");
        for(int i : arr)
            System.out.print(" "+i);
        reverseMe(arr);
        System.out.println("\nAfter Reverse");
        for(int i : arr)
            System.out.print(" "+i);
    }

    private static void reverseMe(int[] arr) {
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}
