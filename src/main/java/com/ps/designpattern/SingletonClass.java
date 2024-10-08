package com.ps.designpattern;

public final class SingletonClass {

    private static SingletonClass obj;

    private SingletonClass(){
        //This check is required
        if(obj!=null){
            System.out.println("SingletonClass private constrictor");
            throw new IllegalStateException("Cannot create a new instance of SingletonClass, use getInstance() method.");
        }
    }

    public static SingletonClass getInstance() {
        //Making it synchronized to avoid diff obj creation in multithreaded environment
        synchronized(SingletonClass.class){
            if (obj == null) {
                obj=new SingletonClass();
            }
            return obj;
        }
    }

    public static void main(String[] args) {
        SingletonClass s1=SingletonClass.getInstance();
        System.out.println(s1);
        SingletonClass s2=SingletonClass.getInstance();
        System.out.println(s2);
        System.out.println(s2==s2);
    }
}
