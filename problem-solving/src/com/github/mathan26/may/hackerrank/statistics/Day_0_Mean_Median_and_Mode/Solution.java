package com.github.mathan26.may.hackerrank.statistics.Day_0_Mean_Median_and_Mode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		//To Get the Input
		Scanner scan = new Scanner(System.in);
		
		//Save the Inut
		int size = scan.nextInt();
		int[] array = new int[size];
		for(int i=0;i<size;i++) {
			array[i] = scan.nextInt();
		}
		
		Arrays.sort(array);
		
		int total = 0;
		
		//Calculate the total Sum
		for(int num:array) {
			total += num;
		}
		
		//Calculate the Mean
		double mean = (double) total/size;
		System.out.println(mean);
		
		
		//Calculate the Meadian
		double median;
		if(size % 2==0) {
			median = (array[size/2 -1] + array[size/2])/2.0;
		}else {
			median =(array[size/2])/2.0;
		}
		
		System.out.println(median);
		
		  /* Calculate Mode - if there's a tie, choose the smaller number */
        HashMap<Integer, Integer> map = new HashMap();
        int maxOccurrences = 0;
        int mode = Integer.MAX_VALUE;
        for (int num : array) {
            map.merge(num, 1, Integer::sum);
            int occurrences = map.get(num);
            if (occurrences > maxOccurrences || (occurrences == maxOccurrences && num < mode)) {
                maxOccurrences = occurrences;
                mode = num;
            }
        }
        System.out.println(mean);
        System.out.println(median);
        System.out.println(mode);
	}
}
