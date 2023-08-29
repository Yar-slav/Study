package com.example.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FirstRecurringCharacter {

    public static void main(String[] args) {
        int res = firstRecurringCharacter(new int[]{-2, 1, -2, 4, -1, 2, 1, -5, 4});
        System.out.println(res);
    }

    static int firstRecurringCharacter(int[] arr) {
        Map<Integer, Integer> map = new HashMap();
        for (int number : arr) {
            if (map.get(number) == null) {
                map.put(number, number);
            } else {
                return number;
            }
        }
        return 0;
    }
}
