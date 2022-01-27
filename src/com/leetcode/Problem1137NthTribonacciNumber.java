package com.leetcode;

public class Problem1137NthTribonacciNumber {

    public static void main(String[] args) {
        Problem1137NthTribonacciNumber tribonacciNumber = new Problem1137NthTribonacciNumber();
        System.out.println(tribonacciNumber.tribonacci(4));
        System.out.println(tribonacciNumber.tribonacci(25));
    }
    public int tribonacci(int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        if(n == 2)
            return 1;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        for(int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        return dp[n];
    }
}
