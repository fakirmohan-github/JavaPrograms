package com.ps.y_2026.march;
//Two pointer technique is only applicable for the sorted array like this
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8}; // Given sorted array
        int target = 10;  // Target sum
        int left=0;
        int right = arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                System.out.println(arr[left]+" "+arr[right]);
                break;
            } else if (sum>target) {
                right--;
            }else
                left++;
        }

    }
}
