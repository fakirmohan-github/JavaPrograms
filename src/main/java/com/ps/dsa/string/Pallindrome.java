package com.ps.dsa.string;

/*

To check if a string is a palindrome, we need to verify if the string reads the same forwards and backwards.
A palindrome is a string that is the same when reversed, such as "madam", "racecar", or "level".

*/


/*

Two-pointer approach:

Time Complexity:
O(n), where n is the length of the string.
We are iterating through half of the string (one pass from both ends).
Space Complexity: O(1) because we are only using a couple of integer variables (start and end)
and not creating any extra space for data storage.

String reversal approach:
Time Complexity: O(n), where n is the length of the string. The reversal takes O(n) time, and the comparison also takes O(n) time.
Space Complexity: O(n) because the reversed string requires additional space.

*/

public class Pallindrome {
    public static void main(String[] args) {
        String str="level";
        //boolean pallindrome=checkPallindromeUsingTwoPinter(str);
        boolean pallindrome=checkPallindromeUsingStringReversal(str);
        System.out.println("Given String is Pallindrome : "+pallindrome);
    }

    private static boolean checkPallindromeUsingTwoPinter(String str) {
        int start=0;
        int end =str.length()-1;

        while(start < end){
            if(str.toCharArray()[start] != str.toCharArray()[end])
                return false;
            start++;
            end--;
        }
        return true;
    }


    private static boolean checkPallindromeUsingStringReversal(String str) {
        String reversedString = new StringBuilder(str).reverse().toString();
        return str.equals(reversedString);
    }
}
