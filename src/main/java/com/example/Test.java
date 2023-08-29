package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void recursiveFunction() {
        // Викликаємо рекурсивну функцію без закінчення
        recursiveFunction();
    }

    public static void main(String[] args) {
        try {
            recursiveFunction();
        } catch (StackOverflowError e) {
            System.out.println("Отримано StackOverflowError!");
            e.printStackTrace();
        }
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Stud {
    int id;
    String name;
}
