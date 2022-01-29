package com.leetcode;

public class Problem213HouseRobberTwo {

    public static void main(String[] args) {

    }
    public int rob(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        int temp = nums[0];
        nums[0] = 0;
        int max1 = robSub(nums);
        nums[0] = temp;
        temp = nums[nums.length - 1];
        nums[nums.length - 1] = 0;
        int max2 = robSub(nums);
        nums[nums.length - 1] = temp;
        return Math.max(max1, max2);

    }
    public int robSub(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        if(nums.length == 1) {
            return dp[0];
        }
        dp[1] = Math.max(nums[0], nums[1]);

        if(nums.length == 2) {
            return dp[1];
        }
        dp[2] = Math.max(nums[0] + nums[2], nums[1]);

        if(nums.length == 3) {
            return dp[2];
        }
        for(int i = 3; i < nums.length; i++) {
            dp[i] = nums[i] + Math.max(dp[i - 2], dp[i - 3]);
        }
        return Math.max(dp[nums.length - 1], dp[nums.length - 2]);
    }
}
