package com.example;

import java.util.HashMap;
import java.util.Iterator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.equals("Bob")) {
                iterator.remove(); // Видаляємо елемент через ітератор
            }
        }

        System.out.println(names); // Вивід: [Alice, Charlie]
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Stud {
    int id;
    String name;
}

