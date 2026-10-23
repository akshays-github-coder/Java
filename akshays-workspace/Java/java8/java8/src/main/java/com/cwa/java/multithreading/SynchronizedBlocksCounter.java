package com.cwa.java.multithreading;

public class SynchronizedBlocksCounter {
    private int c = 0;

    public void inc() {

        // Synchronize only this block
        synchronized (this) {
            c++;
        }
    }

    public int get() {
        return c;
    }
}
