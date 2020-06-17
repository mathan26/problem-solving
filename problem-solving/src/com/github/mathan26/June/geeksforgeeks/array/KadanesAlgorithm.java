package com.github.mathan26.June.geeksforgeeks.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class KadanesAlgorithm {
    public static void main(String[] args) throws IOException {
        //Scanner input = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());  //input.nextInt();
        while (t>0){
            int n=Integer.parseInt(br.readLine());//input.nextInt();
            int[] array = new int[n];
            String line=br.readLine();
            int i=0;
            for (String data:line.split("\\s")){
                array[i]=Integer.parseInt(data);
                i++;
            }
            findMaxSubArray(n, array);
            t--;
        }
    }

    private static void findMaxSubArray(int n, int[] array) {
        int localSum=array[0];
        int globalSum=array[0];

        for(int i=1;i<n;i++){
            int temp=localSum+array[i];
            localSum=Math.max(array[i], temp);
            globalSum=Math.max(globalSum,localSum);
        }

        System.out.println(globalSum);

    }
}
