package com.ps.multithreading.locks.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

/*
ReentrantLock (from java.util.concurrent.locks.ReentrantLock)
Features:
Basic Locking: A ReentrantLock is a more flexible version of the traditional synchronized block. It provides explicit lock and unlock mechanisms that can be controlled programmatically.
Reentrant: A thread can acquire the lock multiple times without causing a deadlock. Each call to lock() must be paired with a corresponding unlock(). The lock is "reentrant" because a thread that already holds the lock can acquire it again.
Fairness: ReentrantLock can be created with a fairness parameter. If set to true, the lock ensures that the longest-waiting thread gets the lock next (FIFO order). If set to false, the lock doesn't guarantee any particular order.
Interruptible Locking: Unlike synchronized, a ReentrantLock can be interrupted while waiting to acquire the lock. The method lockInterruptibly() allows a thread to acquire the lock, but if it's interrupted, it will throw an InterruptedException.
Condition Variables: ReentrantLock provides Condition objects that allow more flexible thread synchronization, like waiting for some condition to be met before proceeding.
 */

public class ReentrantLockExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void doWork() {
        lock.lock();  // Acquiring the lock
        try {
            // Critical section code
            System.out.println(Thread.currentThread().getName() + " is working.");
        } finally {
            lock.unlock();  // Releasing the lock
        }
    }

    public static void main(String[] args) {
        ReentrantLockExample example = new ReentrantLockExample();
        example.doWork();
    }
}
