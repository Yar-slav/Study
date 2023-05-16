package com.example.singleton;

public class MySingleton {
    private static MySingleton instance;
    private String name;

    // private constructor to prevent external instantiation
    // приватний конструктор для запобігання зовнішньому створенню екземплярів
    private MySingleton(String name) {
        this.name = name;
    }

    public static MySingleton getInstance(String name) {
        if (instance == null) {
            instance = new MySingleton(name);
        }
        return instance;
    }

    public String getName() {
        return name;
    }
}
