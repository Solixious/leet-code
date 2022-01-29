package com.leetcode;

import java.util.HashMap;

public class Problem740DeleteAndEarn {

    public static void main(String[] args) {
        Problem740DeleteAndEarn deleteAndEarn = new Problem740DeleteAndEarn();
        int[] ar = {2,2,3,3,3,4};
        System.out.println(deleteAndEarn.deleteAndEarn(ar));
    }
    public int deleteAndEarn(int[] nums) {
        int[] sum = new int[10001];
        int[] dp = new int[10001];

        for(int num : nums) {
            sum[num] += num;
        }
        dp[1] = sum[1];
        dp[2] = sum[2];
        for(int i = 2; i <= 10000; i++) {
            dp[i] = Math.max(sum[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[10000];
    }
}
