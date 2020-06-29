package com.github.mathan26.June.geeksforgeeks.array;

import java.util.Scanner;

public class LeadersInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        findLeadersInArray(n,arr);
    }

    private static void findLeadersInArray(int n, int[] arr) {
        int max_element=arr[n-1];
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=max_element){
                System.out.print(arr[i] +" ");
                max_element=arr[i];
            }
        }

    }
}
