package com.example.multithreading;

public class Count {
    private Long counter = 0L;

    synchronized public void increment(){
        counter++;
    }

    public Long getCounter(){
        return counter;
    }
}
