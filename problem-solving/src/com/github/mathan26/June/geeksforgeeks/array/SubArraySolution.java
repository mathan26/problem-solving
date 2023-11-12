package com.github.mathan26.June.geeksforgeeks.array;

import java.util.Scanner;

public class SubArraySolution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            int sum = input.nextInt();

            int[] arr = new int[n];

            for (int k = 0; k < n; k++) {
                arr[k] = input.nextInt();
            }

            findSubArray(n, sum, arr);
        }
    }

    private static void findSubArray(int n, int sum, int[] arr) {

        long result = arr[0];
        int first = 0;
        int last = 0;
        while (result != sum) {
            if (result > sum) {
                if (first == last) {
                    first++;
                    last++;
                    if (last >= n) {
                        break;
                    }
                    result = arr[first];
                } else {
                    result -= arr[first];
                    first++;
                }
            } else {
                last++;
                if (last >= n) {
                    break;
                } else {
                    result += arr[last];
                }
            }
        }
        if (result != sum) {
            System.out.println("-1");
        } else {
            System.out.println((first + 1) + " " + (last + 1));
        }
    }
}
