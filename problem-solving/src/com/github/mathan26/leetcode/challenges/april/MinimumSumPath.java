package com.github.mathan26.leetcode.challenges.april;

public class MinimumSumPath {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        if (row == 0)
            return 0;
        int col = grid[0].length;
        int[][] dp = new int[row][col];

        //assign the 0,0 to dp[0][0]

        //Fill the 1st Row alone
        dp[0][0] = grid[0][0];
        for (int i = 1; i < col; i++) {
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }

        //Fill the 1st column
        for (int i = 1; i < row; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }

        //Fill the rest
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[row - 1][col - 1];
    }
}
