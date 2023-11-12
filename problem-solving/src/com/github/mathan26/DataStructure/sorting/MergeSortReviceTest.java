package com.github.mathan26.DataStructure.sorting;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class MergeSortReviceTest {
    @org.junit.jupiter.api.Test
    public void testMerge() {
        int[] expected = {1, 2, 3, 4, 6, 13, 28};
        int[] arr = new int[]{2, 13, 4, 1, 3, 6, 28};
        int l = 0;
        int r = arr.length - 1;
        MergeSortRevice.mergeSort(arr, l, r);
        System.out.println(Arrays.toString(arr));
        assertArrayEquals(expected, arr);
    }

}
