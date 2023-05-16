package com.example.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
        static MajorityElement test = new MajorityElement();
        public static void main(String[] args) {
            int[] mas = {2,6,6,2,1,6,1,6};
            System.out.println(test.majorityElement(mas));
        }

    public int majorityElement(int[] nums) {
        int majorlyElement = nums[0];
        int size = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            Integer value = map.get(num);
            if (value != null) {
                map.put(num, value + 1);
                // витягує найбільш частий елемент,
                // якщо робити по умові задачі (витягувати елемент тільки якщо кількість цього елементу є більше половини)
                // то нижнього if не потрібно
                if(map.get(num) > map.get(majorlyElement)) {
                    majorlyElement= num;
                }
            } else {
                map.put(num, 1);
            }
            if (map.get(num) > size / 2) {
                return num;
            }
        }
        return majorlyElement;
    }

//        public int majorityElement(int[] nums) {
//            int candidate = nums[0];
//            int count = 1;
//            for (int i = 1; i < nums.length; i++) {
//                if (count == 0) {
//                    candidate = nums[i];
//                }
//                if (nums[i] == candidate) {
//                    count++;
//                } else {
//                    count--;
//                }
//            }
//            return candidate;
//        }
}
