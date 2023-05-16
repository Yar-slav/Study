package com.example;


public class MutableDepartment {
    public static void main(String[] args) {
        String s = "s";
        String s1 = "s";
        String ss = new String("s");
        String ss2 = new String("s");

        System.out.println(ss == ss2);
    }
}

class Child extends Parent{
    void print(){
        System.out.println("Child");
    }
}

class Parent {
    void method(){
        print();
    }

    void print(){
        System.out.println("Parent");
    }
}
