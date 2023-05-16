package com.example.multithreading;

import lombok.SneakyThrows;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class DeadlockExample {
    private static Count c1 = new Count();
    private static Count c2 = new Count();

    @SneakyThrows
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (c1) {
                sleepSeconds(2);
                c2.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (c2) {
                c1.increment();
            }
        });

        Thread thread3 = new Thread(() -> {
            while (true) {
                System.out.println(t1.getName() + ": " + t1.getState());
                System.out.println(t2.getName() + ": " + t2.getState());
                sleepSeconds(1);
            }
        });

        thread3.start();

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }

    @SneakyThrows
    private static void sleepSeconds(int seconds) {
        TimeUnit.SECONDS.sleep(seconds);
    }
}

