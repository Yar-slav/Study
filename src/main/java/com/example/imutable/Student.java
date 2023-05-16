package com.example.imutable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public final class Student {
    private final int age;
    private final String name;
}
