package com.ps.dsa.string;

/*

Anagrams: Two strings are anagrams if, after rearranging the characters of one string,
you can form the other string. For example, "listen" and "silent" are anagrams because they contain the same characters in the same frequencies, just in a different order.

*/

/*

Approach:
There are several ways to check if two strings are anagrams:

------------------------------------------
Sorting Approach:
Sort both strings, and then compare them. If they are anagrams, the sorted versions of the
strings will be identical.

Sorting both strings takes O(n log n), where n is the length of the strings.
Comparing the sorted arrays takes O(n).
Overall Time Complexity: O(n log n).

-------------------------------------------
Character Frequency Count Approach:

Count the frequency of each character in both strings and compare the counts.
If the frequencies match, the strings are anagrams.

Counting the frequency of characters takes O(n) for both strings.
Comparing two maps takes O(k), where k is the number of unique characters. In the worst case, this is O(n).
Overall Time Complexity: O(n).

*/


import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2="silentta";
        //boolean anagram=checkForAnagramWithSorting(str1,str2);
        boolean anagram=checkForAnagramWithCharFreqCount(str1,str2);
        System.out.println("Given Strings are Anagram : "+anagram);
    }

    private static boolean checkForAnagramWithCharFreqCount(String str1, String str2) {

        if(str1.length() != str2.length())
            return false;

        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();

        for(int i=0 ; i<str1.length() ; i++){
            map1.put(str1.charAt(i),map1.getOrDefault(str1.charAt(i),0)+1);
            map2.put(str2.charAt(i),map2.getOrDefault(str2.charAt(i),0)+1);
        }
        return map1.equals(map2);
    }

    private static boolean checkForAnagramWithSorting(String str1, String str2) {
        String sortedStr1=str1.chars()
                .mapToObj(ch->(char)ch)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining());
        String sortedStr2=str2.chars()
                .mapToObj(ch->(char)ch)
                .sorted()
                .map(String :: valueOf)
                .collect(Collectors.joining());

        return sortedStr1.equals(sortedStr2);

    }


}
