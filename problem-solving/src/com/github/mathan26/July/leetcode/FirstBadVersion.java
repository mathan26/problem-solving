package com.github.mathan26.July.leetcode;

public class FirstBadVersion {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }

    private static int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private static boolean isBadVersion(int version) {
        return version == 3;
    }
}
