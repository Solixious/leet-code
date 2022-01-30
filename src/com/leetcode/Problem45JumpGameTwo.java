package com.leetcode;

public class Problem45JumpGameTwo {
    public static void main(String[] args) {
        Problem45JumpGameTwo jumpGameTwo = new Problem45JumpGameTwo();
        int[] ar = {2,3,1,1,4};
        System.out.println(jumpGameTwo.jump(ar));
    }
    public int jump(int[] nums) {
        int stepCount = 0;
        int maxReach = 0;
        int level = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            maxReach = Math.max(maxReach, i + nums[i]);
            if(level == i) {
                level = maxReach;
                stepCount++;
            }
        }
        return stepCount;
    }
}
