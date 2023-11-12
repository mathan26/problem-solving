package com.github.mathan26.June.geeksforgeeks.array;

import java.util.Scanner;

public class SubArraySumWIthTestCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int sum = scanner.nextInt();
            int[] arr = new int[n];
            for (int k = 0; k < n; k++) {
                arr[k] = scanner.nextInt();
            }
            findSubArray(n, sum, arr);
        }
    }

    private static void findSubArray(int n, int s, int[] m) {
        int first = 0;
        int last = 0;

        long result = m[first];

        while (result != s) {
            if (result > s) {
                if (first == last) {
                    last++;
                    first++;
                    if (last >= n) break;
                    result = m[first];
                } else {
                    result -= m[first];
                    first++;
                }
            } else {
                last++;
                if (last < n) {
                    result += m[last];
                } else {
                    break;
                }
            }
        }

        if (result != s) {
            System.out.println(-1);
        } else {
            System.out.println((first + 1) + " " + (last + 1));
        }
    }
}
