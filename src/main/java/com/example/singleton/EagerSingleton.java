package com.example.singleton;

public class EagerSingleton {

    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {
        // приватний конструктор запобігає створенню об’єктів за допомогою `new`
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
