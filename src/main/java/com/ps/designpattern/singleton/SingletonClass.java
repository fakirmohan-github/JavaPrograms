package com.ps.designpattern.singleton;

public final class SingletonClass {

    private static SingletonClass obj = null;

    private SingletonClass(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if(obj!=null){
            System.out.println("SingletonClass private constrictor");
            throw new IllegalStateException("Cannot create a new instance of SingletonClass, use getInstance() method.");
        }
    }

    public static SingletonClass getInstance(){
        if(obj==null){
            synchronized (SingletonClass.class) {
                if(obj==null)
                    obj = new SingletonClass();
            }
        }
        return obj;
    }

    public void showMessage(){
        System.out.println("Singleton Instance :: "+this);
    }
}
