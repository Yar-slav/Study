package com.example.leetcode;

import java.util.stream.Collectors;
import java.util.stream.Stream;

class Scratch {
    public static void main(String[] args) {
        String input = "AAABBBCCADD";

        String reduced = input.chars()
                .mapToObj(el -> (char) el)
                .map(String::valueOf)
                .reduce("", (a, b) -> a.endsWith(b) ? a + b : a + ";" + b);

        String[] split = reduced.split(";");

        var result = Stream.of(split)
                .filter(str -> str.length() > 0)
                .map(str -> "" + str.charAt(0) + str.length())
                .collect(Collectors.joining());

        System.out.println(result);
    }
}