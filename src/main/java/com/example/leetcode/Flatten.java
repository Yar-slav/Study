package com.example.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Flatten {

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(List.of(3, 4, List.of(3, 4)));
        list.add(5);
        list.add("6");


        System.out.println(list);
        System.out.println(flatten(list));
    }

    public static List<Object> flatten(List<Object> list) {
        return list.stream()
                .flatMap(element -> element instanceof List<?>
                        ? flatten((List<Object>) element).stream()
                        : Stream.of(element))
                .collect(Collectors.toList());
    }
}
