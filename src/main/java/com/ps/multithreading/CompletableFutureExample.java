/*

Explanation:
Creating a CompletableFuture: We create a CompletableFuture using supplyAsync, which runs the provided lambda asynchronously in a separate thread.

Waiting for the result: The get() method blocks until the result of the computation is available.

Chaining: We use thenApplyAsync to transform the result of the first computation. It calculates the length of the string asynchronously.

Key Methods of CompletableFuture:
supplyAsync(): Starts a new asynchronous task that returns a result.
thenApplyAsync(): Allows chaining of tasks that take the result of the previous task and return a transformed result.
get(): Blocks and waits for the completion of the task and retrieves the result.
thenAccept(), thenRun(), thenCombine(), etc., provide further ways to combine and process multiple asynchronous tasks.

*/


package com.ps.multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Simulate a task that fetches data asynchronously
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                // Simulate a delay
                Thread.sleep(2000);
                return "Hello from Future!";
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        });

        // You can continue with other tasks while the future is being computed
        System.out.println("Doing other work while waiting...");

        // Get the result of the future when it's ready (this blocks until the result is available)
        String result = future.get();
        System.out.println("Received from CompletableFuture: " + result);

        // Chaining multiple asynchronous tasks
        CompletableFuture<Integer> lengthFuture = future.thenApplyAsync(res -> {
            return res.length();
        });

        System.out.println("Length of the result string: " + lengthFuture.get());
    }
}

