package com.github.mathan26.June.geeksforgeeks.array;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MissingNumInArray {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] array = new int[n];
            String line = br.readLine();
            int i = 0;
            for (String data : line.split("\\s")) {
                array[i] = Integer.parseInt(data);
                i++;
            }
            findMissingNumber(n, array);
        }

    }

    private static void findMissingNumber(int n, int[] array) {
        int total = (n) * (n + 1) / 2;
        for (int i = 0; i < n; i++) {
            total -= array[i];
        }
        System.out.println(total);
    }

}
