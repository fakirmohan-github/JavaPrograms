package com.ps.interview;

public final class SingletonClass {

    private static SingletonClass obj;

    private SingletonClass(){}

    public static  SingletonClass getInstance() {
        synchronized(SingletonClass.class){
            if (obj == null) {
                return new SingletonClass();
            } else
                return obj;
        }
    }

    public static void main(String[] args) {
        SingletonClass s1=SingletonClass.getInstance();
        System.out.println(s1);
        SingletonClass s2=SingletonClass.getInstance();
        System.out.println(s2==s2);
    }
}
