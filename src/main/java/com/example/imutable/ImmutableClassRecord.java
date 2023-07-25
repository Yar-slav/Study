package com.example.imutable;

import java.util.ArrayList;
import java.util.List;

public record ImmutableClassRecord(int id, Student student, List<Student> students) {

    // конструктор з глибоким копіюванням полів
    public ImmutableClassRecord(int id, Student student, List<Student> students) {
        this.id = id;
        this.student = new Student(student.getAge(), student.getName()); // Create a new Student object to ensure immutability
        this.students = List.copyOf(students);
    }

    // перевизначає гетер щоб зробити копію
    @Override
    public Student student() {
        return new Student(student.getAge(), student.getName());
    }

    // перевизначає гетер щоб зробити копію
    @Override
    public List<Student> students() {
        List<Student> copyArrayList = new ArrayList<>();
        for (Student stud : students) {
            copyArrayList.add(new Student(stud.getAge(), stud.getName()));
        }
        return copyArrayList;
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "id=" + id +
                ", student=" + student +
                ", students=" + students +
                '}';
    }
}
