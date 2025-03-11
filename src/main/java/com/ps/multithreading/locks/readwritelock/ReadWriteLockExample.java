package com.ps.multithreading.locks.readwritelock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample {
    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    public void read() {
        lock.readLock().lock();  // Acquiring the read lock
        try {
            // Reading critical section code
            System.out.println(Thread.currentThread().getName() + " is reading.");
        } finally {
            lock.readLock().unlock();  // Releasing the read lock
        }
    }

    public void write() {
        lock.writeLock().lock();  // Acquiring the write lock
        try {
            // Writing critical section code
            System.out.println(Thread.currentThread().getName() + " is writing.");
        } finally {
            lock.writeLock().unlock();  // Releasing the write lock
        }
    }

    public static void main(String[] args) {
        ReadWriteLockExample example = new ReadWriteLockExample();
        example.read();
        example.write();
    }
}
