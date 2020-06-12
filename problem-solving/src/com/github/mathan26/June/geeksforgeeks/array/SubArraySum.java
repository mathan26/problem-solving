package com.github.mathan26.June.geeksforgeeks.array;

public class SubArraySum {
    public static void main(String[] args) {
        SubArraySum obj = new SubArraySum();
        int[] arr = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        int sum = 23;
        obj.bruteForceApproach(arr, n, sum);
        obj.efficientApproach(arr, n, sum);
    }

    private int efficientApproach(int[] arr, int n, int sum) {
        int current_sum = arr[0];
        int start = 0;
        for(int i=1;i<=n;i++){
            while (current_sum > sum &&start< i-1){
                current_sum=current_sum -arr[start];
                start++;
            }
            if(current_sum ==sum){
                int p=i-1;
                System.out.println("Sum found between indexes "+start+" and "+p);
                return 1;
            }
            if(i<n){
                current_sum =current_sum +arr[i];
            }
        }
        System.out.println("No sub array found!");
        return 0;
    }

    private int bruteForceApproach(int[] arr, int n, int sum) {
        int current_sum=0;
        for(int i=0;i<n;i++){
            current_sum=arr[i];
            for(int j=i+1;j<n;j++){
                if(current_sum==sum){
                    System.out.println("Sum found between indexes "+i+" and  "+(j-1));
                    return 1;
                }
                if(current_sum>sum || j==n){
                    break;
                }
                current_sum =current_sum + arr[j];
            }
        }
        System.out.println("No Subarray Found!");
        return 0;
    }


}
