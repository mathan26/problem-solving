package com.github.mathan26.may.hackerrank.statistics.Day_1_Quartiles;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size= scan.nextInt();
        int[] elements = new int[size];
        for(int i=0;i<size;i++){
            elements[i]=scan.nextInt();
        }
        Arrays.sort(elements);
        //1 2 3 4 5
        int q1=findMedian(elements,0,size/2-1);
        int q2=findMedian(elements,0,size-1);
        int q3=findMedian(elements,(size+1)/2,size-1);

        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q3);
    }

    private static int findMedian(int[] elements, int start, int end) {
        if((end-start)%2==0){
            return (elements[(start+end)/ 2]);
        }else {
            System.out.println(start + " "+end);
            int value1=elements[(start+end)/2];
            int value2=elements[(start+end)/2 + 1];
            return  Math.round((value1+value2) /2);
        }
    }
}
