package com.leetcode;

public class Problem509FibonacciNumber {

    public static void main(String[] args) {
        Problem509FibonacciNumber fibonacciNumber = new Problem509FibonacciNumber();
        System.out.println(fibonacciNumber.fib(2));
        System.out.println(fibonacciNumber.fib(3));
        System.out.println(fibonacciNumber.fib(4));
    }
    public int fib(int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
