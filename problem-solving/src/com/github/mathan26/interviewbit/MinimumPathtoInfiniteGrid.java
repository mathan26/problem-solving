package com.github.mathan26.interviewbit;
// Java program to cover a
// sequence of points in
// minimum steps in a given order.
import java.io.*;
import java.util.*;
import java.lang.*;



// class denoted as point
class point
{
    int x, y;
    point(int a, int b)
    {
        x = a;
        y = b;

    }
}

public class MinimumPathtoInfiniteGrid
{
    // function to give minimum
// steps to move from point
// p1 to p2
    static int shortestPath(point p1,
                            point p2)
    {
        // dx is total horizontal
        // distance to be covered
        int dx = Math.abs(p1.x - p2.x);

        // dy is total vertical
        // distance to be covered
        int dy = Math.abs(p1.y - p2.y);

        // required answer is
        // maximum of these two
        return Math.max(dx, dy);
    }

    // Function to return
// the minimum steps
    static int coverPoints(point sequence[],
                           int size)
    {
        int stepCount = 0;

        // finding steps for
        // each consecutive
        // point in the sequence
        for (int i = 0; i < size - 1; i++)
        {
            stepCount += shortestPath(sequence[i],
                    sequence[i + 1]);
        }

        return stepCount;
    }

    // Driver code
    public static void main(String args[])
    {
        // arr stores sequence of points
        // that are to be visited
        point arr[] = new point[4];
        arr[0] = new point(4, 6);
        arr[1] = new point(1, 2);
        arr[2] = new point(4, 5);
        arr[3] = new point(10, 12);

        int n = arr.length;
        System.out.println(coverPoints(arr, n));
    }
}
