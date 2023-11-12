package com.github.mathan26.problems.simple;

/*
public class Fibo {
    public static void main(String[] args) {
        int number= 6;
        findFibonacci(number);
    }

    private static void findFibonacci(int number) {
        int prev=0;
        int next=1;
        int result;
        while (number > 0){
            System.out.println(prev);
            result = prev + next;
            prev = next;
            next=result;
            number --;
        }
    }
}
*/


//0 1 1 2 3 5
// Dynamic Programming approach for
// Fibonacci Series

public class Fibo {

    // Function to find the fibonacci Series
    static int fib(int n) {

        // Declare an array to store
        // Fibonacci numbers.
        // 1 extra to handle case, n = 0
        int f[] = new int[n + 2];

        int i;

        // 0th and 1st number of
        // the series are 0 and 1
        f[0] = 0;
        f[1] = 1;

        for (i = 2; i <= n; i++) {

            // Add the previous 2 numbers
            // in the series and store it
            f[i] = f[i - 1] + f[i - 2];
        }

        // Nth Fibonacci Number
        return f[n];
    }

    public static void main(String args[]) {
        // Given Number N
        int N = 10;

        // Print first 10 term
        for (int i = 0; i < N; i++)
            System.out.print(fib(i) + " ");

        Fibo obj = new Fibo();
        //obj.display(new Fibo());
    }

    public void display(String user) {

    }

    public void display(int Rolno) {

    }
}
