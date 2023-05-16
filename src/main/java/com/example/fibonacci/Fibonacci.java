package com.example.fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        int size = 30;
        long previous = 0;
        long current = 1;

        for (int i = 0; i <= size; i++) {
            System.out.println(i + ": " + previous);
            long next = previous + current;
            previous = current;
            current = next;
        }
    }
}
