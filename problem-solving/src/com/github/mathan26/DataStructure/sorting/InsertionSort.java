package com.github.mathan26.DataStructure.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        int hole;
        int value;
        for (int i = 1; i < arr.length; i++) {
            value = arr[i];
            hole = i;
            while (hole > 0 && arr[hole - 1] > value) {
                arr[hole] = arr[hole - 1];
                hole = hole - 1;
            }
            arr[hole] = value;
        }
    }


}
