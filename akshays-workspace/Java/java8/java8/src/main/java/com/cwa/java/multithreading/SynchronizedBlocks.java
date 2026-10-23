package com.cwa.java.multithreading;

public class SynchronizedBlocks {
    public static void main(String[] args)
            throws InterruptedException{

        SynchronizedBlocksCounter cnt = new SynchronizedBlocksCounter();

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
        t1.join();
        t2.join();

        System.out.println("Counter: " + cnt.get());
        System.out.println("Explanation: The synchronized block ensures mutual exclusion only for the increment statement, reducing the locking overhead.");
    }
}
