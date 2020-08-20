package com.github.mathan26.leetcode.challenges.april;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {
    public static void main(String[] args) {
        int[] array={3,4,7,2,-3,1,4,2,2,2,3};
        int k=7;
        bruteForce(array,k);  // O(n2)
        prefixSum(array,k);     // O(nlogn)
        efficientSolutionUsingHashMap(array,k);


    }

    private static void efficientSolutionUsingHashMap(int[] array, int k) {
        int counter=0;
        int currentSum=0;
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            currentSum +=array[i];

            if(currentSum==k){
                counter++;
            }
            if(map.containsKey(currentSum-k)){
                counter = counter + map.get(currentSum-k);
            }

            map.put(currentSum,map.getOrDefault(currentSum,0)+1);

        }

        System.out.println(counter);
    }

    private static void prefixSum(int[] array, int k) {
        int[] sumArray=new  int[array.length];
        int sum=0;
        int count=0;
        for (int i = 0; i <array.length ; i++) {
            sum +=array[i];
            sumArray[i] =sum;
        }
        for (int i = 0; i < array.length; i++) {

            if(sumArray[i]==k){
                count++;
            }
            if(checkValueExists(sumArray[i]-k, sumArray)){
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean checkValueExists(int value,int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            if(value == arr[j]){
                return true;
            }
        }
        return false;
    }

    private static void bruteForce(int[] array,int k) {
        int counter=0;
        for (int i = 0; i <array.length ; i++) {
            int sum=0;
            for (int j = i + 1; j <array.length ; j++) {
                sum=sum + array[i] + array[j];
                if(sum==k)
                    counter++;
            }
        }

        System.out.println(counter);
    }
}
