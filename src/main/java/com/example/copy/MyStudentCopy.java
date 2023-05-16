package com.example.copy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MyStudentCopy {

    private String name;
    private int age;
    private Set<String> subjects;

    public MyStudentCopy(String name, int age, Set<String> subjects)
    {
        this.name = name;
        this.age = age;
        this.subjects = subjects;
    }

    // Конструктор копирования
    public MyStudentCopy(MyStudentCopy student)
    {
        this.name = student.name;
        this.age = student.age;

        // поверхностная копия
        // this.subjects = student.subjects;

        // глубокая копия — создать новый экземпляр `HashSet`
        this.subjects = new HashSet<>(student.subjects);
    }

    // Копируем фабрику
    public static MyStudentCopy newInstance(MyStudentCopy student) {
        return new MyStudentCopy(student);
    }

    @Override
    public String toString() {
        return Arrays.asList(name, String.valueOf(age),
                subjects.toString()).toString();
    }

    public Set<String> getSubjects() {
        return subjects;
    }
}
