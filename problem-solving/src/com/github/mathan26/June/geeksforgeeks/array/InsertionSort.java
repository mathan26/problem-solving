package com.github.mathan26.June.geeksforgeeks.array;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int n=arr.length;
        for (int i=1;i<n;i++){
            int value=arr[i];
            int hole=i;

            while (hole>0 && arr[hole-1]>value){
                arr[hole]=arr[hole-1];
                hole -=1;
            }
            arr[hole]=value;
        }
        System.out.println("After sort");
        System.out.println(Arrays.toString(arr));
    }
}
