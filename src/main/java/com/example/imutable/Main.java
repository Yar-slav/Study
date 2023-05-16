package com.example.imutable;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ImmutableClass immutable = new ImmutableClass(
                1,
                new Student(25, "Mike"),
                List.of(new Student(10, "Karl"), new Student(20, "Nina")));

        System.out.println(immutable);
        System.out.println(immutable.hashCode());

        immutable = new ImmutableClass(
                1,
                new Student(65, "Mike"),
                List.of(new Student(10, "Karl"), new Student(20, "Nina")));
        System.out.println(immutable);
        System.out.println(immutable.hashCode());
    }
}
