package com.github.mathan26.June.geeksforgeeks.array;

//Given an array of distinct integers. The task is to count all the triplets
// such that sum of two elements equals the third element.

import java.util.Arrays;
import java.util.Scanner;

public class CountTriplets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            int[] arr = new int[n];
            for (int k = 0; k < n; k++) {
                arr[k] = input.nextInt();
            }
            findTriplets(n, arr);
        }
    }

    private static void findTriplets(int n, int[] arr) {
        Arrays.sort(arr);

        int t = 0;
        for (int i = n - 1; i >= 0; i--) {
            int start = 0;
            int end = i - 1;
            while (start < end) {
                int sum = arr[start] + arr[end];
                if (arr[i] == sum) {
                    t++;
                    start++;
                    end--;
                } else if (arr[i] > sum) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        System.out.println(t != 0 ? t : -1);
    }
}
