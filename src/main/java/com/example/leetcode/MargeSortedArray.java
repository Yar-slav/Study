package com.example.leetcode;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class MargeSortedArray {

    public static void main(String[] args) {
        int[] mas1 = {0, 3, 5, 9};
        int[] mas2 = {1, 2, 5, 6};
        System.out.println(Arrays.toString(margeSortedMassive(mas1, mas2)));
    }

    static int[] margeSortedMassive(int[] arr1, int[] arr2) {
        log.info("massive 1: {}, massive 2: {}", arr1, arr2);
        // TODO: 7/12/23 check for null
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k] = arr1[i];
                i++;
            } else {
                mergedArray[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < arr1.length) {
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }

        return mergedArray;
    }
}
