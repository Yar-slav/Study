package com.example.fibonacci;

public class FibonacciRecursion {
    static long fib(long n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String args[]) {
        long n = 30;
        for (int i = 0; i < n; i++) {
            System.out.println(i + ": " + fib(i) + " ");
        }
    }
}
