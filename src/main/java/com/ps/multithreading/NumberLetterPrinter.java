package com.ps.multithreading;

public class NumberLetterPrinter {

    // Define shared objects to coordinate between threads
    static final Object lock = new Object();
    static private int number = 1;
    static private char letter = 'a';

    public static void main(String[] args) {
        // Create and start the number printing thread
        Thread numberThread = new Thread(new NumberPrinter());
        numberThread.start();

        // Create and start the letter printing thread
        Thread letterThread = new Thread(new LetterPrinter());
        letterThread.start();
    }

    // Number printing thread class
    static class NumberPrinter implements Runnable {
        @Override
        public void run() {
            while (number <= 30) {
                synchronized (lock) {
                    System.out.print(number);
                    number++;
                    lock.notify();  // Notify the letter thread
                    try {
                        if (number <= 30) lock.wait();  // Wait for the letter thread to print
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    // Letter printing thread class
    static class LetterPrinter implements Runnable {
        @Override
        public void run() {
            while (letter <= 'z') {
                synchronized (lock) {
                    System.out.print(letter);
                    letter++;
                    lock.notify();  // Notify the number thread
                    try {
                        if (letter <= 'z') lock.wait();  // Wait for the number thread to print
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}