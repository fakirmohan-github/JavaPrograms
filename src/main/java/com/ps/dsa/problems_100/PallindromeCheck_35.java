package com.ps.dsa.problems_100;

public class PallindromeCheck_35 {
    public static void main(String[] args) {
        String input="kanak";
        checkPallindrome(input);
    }

    private static void checkPallindrome(String input) {
        int left=0;
        int right=input.length()-1;
        while(left<=right){
            if(input.charAt(left)!=input.charAt(right)){
                System.out.println("Given String is not Pallindrome");
                return;
            }
            right--;
            left++;
        }
        System.out.println("Given String is Pallindrome");
    }
}
