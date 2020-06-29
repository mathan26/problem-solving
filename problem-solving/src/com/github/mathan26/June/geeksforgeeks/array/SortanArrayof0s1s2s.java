package com.github.mathan26.June.geeksforgeeks.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortanArrayof0s1s2s {
    public static void main(String[] args) throws IOException {
        int t=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        t=Integer.parseInt(reader.readLine());
        while (t-->0){
            int n=Integer.parseInt(reader.readLine());
            String[] arrayData = reader.readLine().trim().split(" ");

            int[] array = new int[n];
            for(int i=0;i<n;i++){
                array[i]=Integer.parseInt(arrayData[i]);
            }

            efficientSolution(n, array);
            printData(n,array); //O(n logn)
        }
    }

    private static void efficientSolution(int n, int[] a) {
        int l,m;
        l=m=0;
        int h=n-1;

        while (m<=h){
            if(a[m]==0){
                swap(a,l,m);
                m++;
                l++;
            }else if(a[m]==1){
                m++;
            }else {
                if(a[m]==2){
                    swap(a,m,h);
                    h--;
                }
            }
        }
        System.out.println("O(n) solution: "+Arrays.toString(a));
    }

    private static void swap(int[] arr,int a, int b) {
        int temp=arr[a];
        arr[b]=arr[a];
        arr[a]=temp;
    }

    private static void printData(int n, int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr).replaceAll("\\]","").replaceAll(",","").
                replaceAll("\\[",""));
    }
}
