package com.example.imutable;

import java.util.Collections;
import java.util.List;

public final class ImmutableClass {
    private final int id;

    // щоб блас був повністю імутабельним то клас Student має також бути імутабельним
    private final Student student;
    private final List<Student> students;

    public ImmutableClass(int id, Student student, List<Student> students) {
        this.id = id;
        this.student = new Student(student.getAge(), student.getName());
        this.students = List.copyOf(students);
    }

    public int getId() {
        return id;
    }

    public Student getStudent() {
        return new Student(student.getAge(), student.getName());
    }

    public List<Student> getStudents() {
        return List.copyOf(students);
    }
}
