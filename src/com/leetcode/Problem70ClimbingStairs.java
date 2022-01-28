package com.leetcode;

public class Problem70ClimbingStairs {

    public static void main(String[] args) {
        Problem70ClimbingStairs climbingStairs = new Problem70ClimbingStairs();
        System.out.println(climbingStairs.climbStairs(2));
        System.out.println(climbingStairs.climbStairs(3));
    }

    public int climbStairs(int n) {
        if(n <= 2) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
