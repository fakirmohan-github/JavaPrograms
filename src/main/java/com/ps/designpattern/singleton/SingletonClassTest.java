package com.ps.designpattern.singleton;

public class SingletonClassTest {
    public static void main(String[] args) {
        //We can not create the object of singleton class with new keyword like below
        //SingletonClass s1= new SingletonClass();

        SingletonClass s2=SingletonClass.getInstance();
        SingletonClass s3=SingletonClass.getInstance();

        System.out.println(s2==s3);

    }
}
