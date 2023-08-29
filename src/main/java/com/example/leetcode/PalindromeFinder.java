package com.example.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PalindromeFinder {


    public static List<String> getAllPalindromes(String input) {
        return IntStream.range(0, input.length())
                .boxed()
                .flatMap(start -> IntStream.rangeClosed(start + 1, input.length())
                        .mapToObj(end -> input.substring(start, end)))
                .filter(PalindromeFinder::isPalindrome)
                .collect(Collectors.toList());
    }

    public static boolean isPalindrome(String str) {
        return new StringBuilder(str).reverse().toString().equals(str);
    }

    public static void main(String[] args) {
        String input = "level";
        List<String> palindromes = getAllPalindromes(input);

        System.out.println("All possible palindromes in the input string:");
        for (String palindrome : palindromes) {
            System.out.println(palindrome);
        }
    }

//    public static List<String> getAllPalindromes(String input) {
//        List<String> palindromes = new ArrayList<>();
//
//        for (int i = 0; i < input.length(); i++) {
//            for (int j = i + 1; j <= input.length(); j++) {
//                String substring = input.substring(i, j);
//                if (isPalindrome(substring)) {
//                    palindromes.add(substring);
//                }
//            }
//        }
//
//        return palindromes;
//    }
//
//    public static boolean isPalindrome(String str) {
//        int left = 0;
//        int right = str.length() - 1;
//
//        while (left < right) {
//            if (str.charAt(left) != str.charAt(right)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//
//        return true;
//    }
//
//    public static void main(String[] args) {
//        String input = "level";
//        List<String> palindromes = getAllPalindromes(input);
//
//        System.out.println("All possible palindromes in the input string:");
//        for (String palindrome : palindromes) {
//            System.out.println(palindrome);
//        }
//    }
}

