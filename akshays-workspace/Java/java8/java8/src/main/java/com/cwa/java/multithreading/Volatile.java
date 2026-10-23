package com.cwa.java.multithreading;

public class Volatile {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Volatile Keyword\n" +
                "The volatile keyword in Java ensures that all threads have a consistent view of a variable's value. It prevents caching of the variable's value by threads, ensuring that updates to the variable are immediately visible to other threads.\n" +
                "\n" +
                "Working of Volatile Modifier: \n" +
                "* It applies only to variables.\n" +
                "* volatile guarantees visibility i.e. any write to a volatile variable is immediately visible to other threads.\n" +
                "* It does not guarantee atomicity, meaning operations like count++ (read-modify-write operations) can still result in inconsistent values");

        VolatileCounter counter = new VolatileCounter();
        counter.start();

        Thread.sleep(600); // Let it run briefly
        counter.stop();    // Then stop the thread
    }
}