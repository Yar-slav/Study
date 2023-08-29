package com.example;

import lombok.SneakyThrows;

import java.io.IOException;
import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Викликаємо ArithmeticException (ділення на нуль)
            System.out.println("Result: " + result); // Цей код не буде виконано
        } finally {
            int result = 10 / 0;
            System.out.println("Inside finally block");
        }

        System.out.println("Outside try-finally"); // Цей код буде виконано після блоку try-finally
    }
}