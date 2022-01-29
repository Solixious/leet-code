package com.leetcode;

public class Problem746MinCostClimbingStairs {

    public static void main(String[] args) {
        Problem746MinCostClimbingStairs minCostClimbingStairs = new Problem746MinCostClimbingStairs();
        int[] ar = {10, 15, 20};
        System.out.println(minCostClimbingStairs.minCostClimbingStairs(ar));
        int[] ar2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(minCostClimbingStairs.minCostClimbingStairs(ar2));
    }

    public int minCostClimbingStairs(int[] cost) {
        if (cost.length == 1) {
            return cost[0];
        }
        if (cost.length == 2) {
            return Math.min(cost[0], cost[1]);
        }
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }
        return Math.min(dp[dp.length - 1], dp[dp.length - 2]);
    }
}
