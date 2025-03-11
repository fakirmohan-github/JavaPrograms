package com.ps.dsa.arrays_practice;

public class PossibleSubArrays {
    public static void main(String[] args) {
        int[] intArr={1,3,2};
        printSubArrays(intArr,0,0);
    }
    private static void printSubArrays(int[] intArr, int s, int e) {
        if(e==intArr.length){
            return;
        }else if(s>e){
            printSubArrays(intArr,0,e+1);
        }
        else{
            System.out.print("[");
            for(int i=s ; i<e ; i++){
                System.out.print(intArr[i]+ ",");
            }
            System.out.println(intArr[e]+"]");
            printSubArrays(intArr,s+1,e);
        }
    }
}
