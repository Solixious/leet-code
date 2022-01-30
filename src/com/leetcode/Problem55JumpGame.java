package com.leetcode;

public class Problem55JumpGame {
    public static void main(String[] args) {
        Problem55JumpGame jumpGame = new Problem55JumpGame();
        int[] ar = {1,2,3};
        System.out.println(jumpGame.canJump(ar));
    }
    public boolean canJump(int[] nums) {
        int length = nums.length;
        boolean[] dp = new boolean[length];
        dp[length - 1] = true;
        for(int i = length - 2; i >= 0; i--) {
            if(i + nums[i] >= length - 1) {
                dp[i] = true;
                continue;
            }
            for(int j = 0; j <= nums[i]; j++) {
                if(dp[i + j]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[0];
    }
}
