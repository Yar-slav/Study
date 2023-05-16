package com.example.sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {10, 4, 7, 2, 9, 6, 5, 8};
        int[] sortedArr = quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(sortedArr));
    }

    static int[] quickSort(int[] array, int begin, int end) {
        if (begin >= end) return array;
        int pivotElement = array[begin + (end - begin) / 2];

        int i = begin;
        int j = end;
        while (i <= j) {
            while (array[i] < pivotElement) {
                i++;
            }
            while (array[j] > pivotElement) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (begin < j) quickSort(array, begin, j);
        if (end > i) quickSort(array, i, end);

        return array;
    }


}
