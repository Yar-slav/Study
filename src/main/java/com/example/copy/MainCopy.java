package com.example.copy;

import java.util.Arrays;
import java.util.HashSet;

public class MainCopy {
    public static void compare(Object ob1, Object ob2)
    {
        if (ob1 == ob2) {
            System.out.println("Shallow Copy");
        }
        else {
            System.out.println("Deep Copy");
        }
    };

    public static void main(String[] args){
        MyStudentCopy student = new MyStudentCopy("Jon Snow", 22, new HashSet<String>(
                Arrays.asList("Maths", "Science", "English")));

        MyStudentCopy clone = new MyStudentCopy(student);
        System.out.println("Calling Copy Constructor: Clone is " + clone);

        compare(student.getSubjects(), clone.getSubjects());

        MyStudentCopy clone1 = MyStudentCopy.newInstance(student);
        System.out.println("\nCalling Copy Factory: Clone is " + clone1);

        compare(student.getSubjects(), clone.getSubjects());
    }
}
