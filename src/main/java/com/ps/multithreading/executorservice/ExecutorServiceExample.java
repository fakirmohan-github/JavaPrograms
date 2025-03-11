package com.ps.multithreading.executorservice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Create an ExecutorService with a thread pool of 2 threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submit a few tasks to the ExecutorService
        Future<Integer> future1 = executor.submit(() -> {
            Thread.sleep(1000);
            System.out.println("Message from Future 1");
            return 10;
        });

        Future<Integer> future2 = executor.submit(() -> {
            System.out.println("Message from Future 2");
            Thread.sleep(500);
            return 20;
        });

        // Get results from the tasks
        System.out.println("Result from future1: " + future1.get()); // Waits for completion
        System.out.println("Result from future2: " + future2.get()); // Waits for completion

        // Gracefully shutdown the ExecutorService
        executor.shutdown();
    }
}

