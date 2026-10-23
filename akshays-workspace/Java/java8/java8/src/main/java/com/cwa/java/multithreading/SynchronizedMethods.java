package com.cwa.java.multithreading;

public class SynchronizedMethods {

    public static void main(String[] args) {

        // Shared resource
        SynchronizedMethodsCounter cnt = new SynchronizedMethodsCounter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                cnt.inc();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                cnt.inc();
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Counter: " + cnt.get());
        System.out.println("Explanation: Both threads increment the same counter concurrently. Since the inc() and get() methods are synchronized, only one thread can access them at a time, ensuring the correct final count.");
    }
}
