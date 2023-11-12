package com.github.mathan26.DataStructure.sorting;

public class MergeSortRevice {
    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {

            int mid = (l + r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    public static void merge(int[] arr, int l, int mid, int r) {
        int i, j, k = 0;
        int[] temp = new int[r - l + 1];
        i = l;
        j = mid + 1;

        while (i <= mid && j <= r) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                k += 1;
                i += 1; // don't forget to increment
            } else {
                temp[k] = arr[j];
                k += 1;
                j += 1; // don't forget to increment
            }
        }
        while (i <= mid) {
            temp[k] = arr[i];
            k += 1;
            i += 1;
        }

        while (j <= r) {
            temp[k] = arr[j];
            k += 1;
            j += 1;
        }
        // copy temp to arr
        for (int x = l; x <= r; x++) {
            arr[x] = temp[x - l];
        }

    }
}
