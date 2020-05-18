package com.github.mathan26.may.hackerrank.statistics.Day_1_Standard_Deviation;

import java.util.Arrays;
import java.util.Scanner;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size=scan.nextInt();
        int[] elements = new int[size];
        int sum=0;
        for(int i=0;i<size;i++){
            elements[i] = scan.nextInt();
            sum +=elements[i];
        }
        double mean= (double)sum/size;
        //System.out.println(mean);

        double sqrtSum=0;
        for(int i=0;i<size;i++){
            sqrtSum += calculateSqrtDistanceMean(elements[i],mean);
            //   System.out.println(sqrtSum);
        }

        System.out.printf("%.1f",Math.sqrt(sqrtSum/size));

    }

    public static double calculateSqrtDistanceMean(int num1,double num2){
        return ((Math.abs(Math.
                pow((num1-num2),2))));
    }
}
