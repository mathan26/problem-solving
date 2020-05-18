package com.github.mathan26.may.hackerrank.statistics.Day_1_Interquartile_Range;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size= scan.nextInt();
        int[] elements = new int[size];
        int[] frequencies=new int[size];
        int newDataSize=0;
        for(int i=0;i<size;i++){
            elements[i]=scan.nextInt();
        }
        for(int i=0;i<size;i++){
            frequencies[i]=scan.nextInt();
            newDataSize +=frequencies[i];
        }

        int[] data = new int[newDataSize];
        int dataIndex=0;
        for(int i=0;i<size;i++){
            for(int j=0;j<frequencies[i];j++){
                data[dataIndex] = elements[i];
                dataIndex++;
            }
        }
        Arrays.sort(data);
        double q1=findMedian(data,0,newDataSize/2-1);
        double q3=findMedian(data,(newDataSize+1)/2,newDataSize-1);

        System.out.println(q3-q1);
    }

    private static double findMedian(int[] elements, int start, int end) {
        if((end-start)%2==0){
            return (elements[(start+end)/ 2]);
        }else {
            int value1=elements[(start+end)/2];
            int value2=elements[(start+end)/2 + 1];
            return  Math.round((value1+value2) /2.0);
        }
    }
}
