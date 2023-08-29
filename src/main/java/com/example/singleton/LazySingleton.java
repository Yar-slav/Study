package com.example.singleton;

public class LazySingleton {
    private static LazySingleton instance;
    private String name;

    // private constructor to prevent external instantiation
    // приватний конструктор для запобігання зовнішньому створенню екземплярів
    private LazySingleton(String name) {
        this.name = name;
    }

    public static LazySingleton getInstance(String name) {
        if (instance == null) {
            instance = new LazySingleton(name);
        }
        return instance;
    }

    public String getName() {
        return name;
    }
}
