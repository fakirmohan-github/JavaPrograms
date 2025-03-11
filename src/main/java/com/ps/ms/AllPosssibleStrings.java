package com.ps.ms;

public class AllPosssibleStrings {
    public static void main(String[] args) {
        String input = "wxyz";
        char[] charArr=input.toCharArray();
        findAllPossibleString(charArr,0,0);
    }
    private static void findAllPossibleString(char[] charArr,int start,int end) {
        if(end==charArr.length)
            return;
        if(start>end)
            findAllPossibleString(charArr,0,end+1);
        else{
            System.out.print("[");
            for(int i=start ; i<end ; i++){
                System.out.print(charArr[i]+",");
            }
            System.out.println(charArr[end]+"]");
            findAllPossibleString(charArr,start+1,end);
        }
    }
}
