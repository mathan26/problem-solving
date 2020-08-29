package com.github.mathan26.DataStructure.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        boolean sorted=false;
        int lastUnsortedLength = arr.length-1;
        while (!sorted){
            sorted=true;
            for(int i=0;i<lastUnsortedLength;i++){
                if(arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                    sorted=false;
                }
            }
            lastUnsortedLength--;
        }

    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
