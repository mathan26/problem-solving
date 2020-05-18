package com.github.mathan26.may.hackerrank.statistics.Day_0_Weighted_Mean;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size= scan.nextInt();
        int[] elements = new int[size];
        int[] weights= new  int[size];

        for(int i=0;i<size;i++){
            elements[i]=scan.nextInt();
        }
        for(int i=0;i<size;i++){
            weights[i]=scan.nextInt();
        }
        int total=0;
        int weight=0;
        for(int i=0;i<size;i++) {
            total += elements[i] * weights[i];
            weight +=weights[i];
        }
        double weightedMean=(double)(total/weight);
        System.out.format("%.1f",weightedMean);

    }
}
