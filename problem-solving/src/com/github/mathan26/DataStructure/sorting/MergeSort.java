package com.github.mathan26.DataStructure.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        mergerSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private static void mergerSort(int[] array, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergerSort(array, start, mid);
            mergerSort(array, mid + 1, end);
            merge(array, start, mid, end);
        }
    }

    private static void merge(int[] array, int start, int mid, int end) {
        int i, j, k = 0;
        int[] temp = new int[end - start + 1];
        i = start;
        j = mid + 1;

        while (i <= mid && j <= end) {
            if (array[i] <= array[j]) {
                temp[k] = array[i];
                k += 1;
                i += 1;
            } else {
                temp[k] = array[j];
                k += 1;
                j += 1;
            }
        }

        while (i <= mid) {
            temp[k] = array[i];
            k += 1;
            i += 1;
        }

        while (j <= end) {
            temp[k] = array[j];
            k += 1;
            j += 1;
        }

        // ! Copy the temp Array to Original, NOTE the loop start, end and assign value from temp
        for (int l = start; l <= end; l++) {
            array[l] = temp[l - start];
        }

    }
}

