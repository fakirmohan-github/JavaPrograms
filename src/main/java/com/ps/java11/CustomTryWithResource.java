package com.ps.java11;

public class CustomTryWithResource implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println();
    }
}
