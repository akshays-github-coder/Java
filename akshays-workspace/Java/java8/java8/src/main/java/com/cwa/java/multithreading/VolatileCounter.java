package com.cwa.java.multithreading;

class VolatileCounter {
    private volatile boolean running = true;

    public void stop() {
        running = false;
    }

    public void start() {
        new Thread(() -> {
            while (running) {
                System.out.println("Running...");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Stopped.");
            System.out.println("Explanation: The volatile variable running ensures that updates made by one thread (in stop()) are visible to the thread running the loop in start().");
        }).start();
    }
}
