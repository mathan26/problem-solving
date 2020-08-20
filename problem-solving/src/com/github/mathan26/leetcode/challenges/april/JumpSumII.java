package com.github.mathan26.leetcode.challenges.april;


/**
 * Approach : Peak valley
 *
 * 1. Check the maximum jump from the current Index
 * 2. Keep track it in the variable
 * 3. In case iteration is greater than the tracking variable then we cannot reach the end
 * 4. Based on that return the result.
 */
public class JumpSumII {
    public boolean canJump(int[] nums) {
        int size=nums.length;

        int reachable=0;

        for(int i=0;i<size;i++){
            if(reachable<i)  // Exit condition
                return false;
            reachable =Math.max(reachable, i + nums[i]); // check with the max and store it
        }

        return true;
    }
}
