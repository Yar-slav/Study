package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CloneObject {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("d");
        list.add("dv");

      list.stream()
                .map(String::toUpperCase);

      list.stream().skip(1);

      list.stream().forEach(System.out::println);

    }
}
