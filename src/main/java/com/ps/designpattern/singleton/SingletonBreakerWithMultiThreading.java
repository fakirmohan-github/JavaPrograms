package com.ps.designpattern.singleton;

public class SingletonBreakerWithMultiThreading extends Thread{
    public static void main(String[] args) {

        Runnable task=()->{
            SingletonClass singletonClass = SingletonClass.getInstance();
            singletonClass.showMessage();
        };

        for(int i=0 ; i<5 ; i++){
            new Thread(task).start();
        }

    }

}
