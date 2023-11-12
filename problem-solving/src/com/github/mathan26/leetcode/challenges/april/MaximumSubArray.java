package com.github.mathan26.leetcode.challenges.april;

/*
Input: [-2,1,-3, ,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
 */
public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int meh = 0;
        int msf = Integer.MIN_VALUE;
        for (int i : nums) {
            meh = meh + i;
            if (meh < i) {
                meh = i;
            }
            if (msf < meh) {
                msf = meh;
            }
        }
        return msf;
    }
}
