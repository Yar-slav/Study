package com.example.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr= {1,4,7,2,9,6,5,8};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

//    static int[] bubbleSort(int[] array) {
//        int size = array.length;
//        do {
//            for (int i = 0; i < size - 1; i++) {
//                if (array[i] > array[i + 1]) {
//                    int next = array[i];
//                    array[i] = array[i + 1];
//                    array[i + 1] = next;
//                }
//            }
//            size--;
//        } while (size >= 2);
//        return array;
//    }

//    static int[] bubbleSort(int[] array) {
//        boolean isSorted = false;
//        while(!isSorted) {
//            isSorted = true;
//            for (int i = 0; i < array.length-1; i++) {
//                if (array[i] > array[i + 1]) {
//                    int current = array[i];
//                    array[i] = array[i + 1];
//                    array[i + 1] = current;
//                    isSorted = false;
//                }
//            }
//        }
//        return array;
//    }

    static int[] bubbleSort(int[] array) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int current = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = current;
                }
            }
        }
        return array;
    }
}
