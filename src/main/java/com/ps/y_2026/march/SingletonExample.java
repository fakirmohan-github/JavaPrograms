package com.ps.y_2026.march;

public class SingletonExample {
    private SingletonExample obj = null;
    private SingletonExample(){
         if(obj != null ){
             throw new IllegalStateException("");
         }
    }
    public SingletonExample getInstance() {
        if (obj == null) {
            synchronized (SingletonExample.class) {
                if (obj == null) {
                    obj = new SingletonExample();
                }
            }
        }
        return obj;
    }
}
