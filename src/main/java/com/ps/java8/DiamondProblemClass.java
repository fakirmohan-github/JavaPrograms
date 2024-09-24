package com.ps.java8;

public class DiamondProblemClass implements DiamondProblemInterface1,DiamondProblemInterface2{

    //If the same method present in both implemented interface we have to provide the Interface name
    //explicitly to overcome Diamond Problem to pick the proper method
    @Override
    public void printMessage() {
        DiamondProblemInterface2.super.printMessage();
    }
    public static void main(String[] args) {
        DiamondProblemClass dp=new DiamondProblemClass();
        dp.printMessage();
    }
}
