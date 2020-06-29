package com.github.mathan26.June.geeksforgeeks.array;

public class MinimumNoofPlatformReqBf {
    public static void main(String[] args) {
        int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
        int n = arr.length;
        System.out.println(findPlatform(arr,dep,n));
    }

    private static int findPlatform(int[] arr, int[] dep, int n) {
        int result=1;
        int max_platform=1;
        for(int i=0;i<n;i++){
            max_platform = 1;
            for(int j=i+1;j<n;j++){
                if(arr[i]>=arr[j] && arr[i]<=dep[j] || arr[j]>=arr[i] && arr[j]<=dep[i]){
                    max_platform++;
                }
            }
            result=Math.max(result,max_platform);
        }
        return result;
    }
}
