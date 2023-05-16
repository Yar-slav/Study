package com.example.sort;

import java.util.Arrays;

public class InsertSort {

    public static void main(String[] args) {
        int[] arr= {1,4,7,2,9,6,5,8};
        System.out.println(Arrays.toString(insertSort(arr)));
    }

    // у найгіршому випадку складність O(N2) у найкращому(якщо масив вже відсортований O(N))
    static int[] insertSort (int[] array) {
        int len = array.length;
        for(int i = 1; i < len; i++) {
            int current = array[i]; // беру існуючу карточку
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j]; // суну карту праворуч
                j--;
            }
            array[j + 1] = current;
        }
        return array;
    }
}
