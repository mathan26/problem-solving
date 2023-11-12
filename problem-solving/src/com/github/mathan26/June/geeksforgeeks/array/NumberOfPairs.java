package com.github.mathan26.June.geeksforgeeks.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOfPairs {
    public static void main(String[] args) throws IOException {
        int t = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            int m = 0;
            int n = 0;
            String[] element = reader.readLine().trim().split(" ");
            m = Integer.parseInt(element[0]);
            n = Integer.parseInt(element[1]);

            int[] x = new int[m];
            int[] y = new int[n];
            String[] a = reader.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                x[i] = Integer.parseInt(a[i]);
            }
            String[] b = reader.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                y[i] = Integer.parseInt(b[i]);
            }

            int result = bruteForcefindNumberOfPairs(x, y, m, n); // ### but some test case failed!
            System.out.println(result);
        }
    }

    private static int bruteForcefindNumberOfPairs(int[] x, int[] y, int m, int n) {
        int result = 0;

//        X^y >Y^x

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.pow(x[i], y[j]) > Math.pow(y[j], x[i])) {
                    result++;
                }
            }
        }
        return result;
    }
}
