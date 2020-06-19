package com.github.mathan26.June.geeksforgeeks.array;

import java.util.Arrays;

public class ReArrangeArrayAlternatively {
    public static void main(String[] args) {
        int n=11;
        int[] arr={1,2,3,4,5,6,7,8,9,10,11};
        reArrangeArrayWithMaxandMin(n,arr);
        reArrangeArrayWithMaxandMinWithoutExtraSpace(n,arr);
    }

    private static void reArrangeArrayWithMaxandMinWithoutExtraSpace(int n, int[] arr) {
        int min_idx=0;
        int max_idx=n-1;

        int max_element = arr[max_idx]+1;

        for(int i=0;i<n;i++){
            if(i%2 ==0){
                arr[i] +=(arr[max_idx]%max_element)*max_element;
                max_idx--;
            }else {
                arr[i] +=(arr[min_idx]%max_element)*max_element;
                min_idx++;
            }
        }

        for (int i=0;i<n;i++){
            arr[i]=arr[i]/max_element;
        }

        System.out.println(Arrays.toString(arr));

    }

    private static void reArrangeArrayWithMaxandMin(int n, int[] arr) {
        int[] temp=new int[n];
        int min=0;
        int max=arr.length-1;
        boolean flag=true;
        for(int i=0;i<n;i++){
            if(flag)
            temp[i]=arr[max--];
            else
            temp[i]=arr[min++];

            flag=!flag;
        }
        System.out.println(Arrays.toString(temp));
    }
}
