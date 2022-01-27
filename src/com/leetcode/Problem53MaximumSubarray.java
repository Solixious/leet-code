package com.leetcode;

public class Problem53MaximumSubarray {

    public static void main(String[] args) {
        Problem53MaximumSubarray maximumSubArray = new Problem53MaximumSubarray();
        int[] ar = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maximumSubArray.maxSubArray(ar));
        int[] ar2 = {1};
        System.out.println(maximumSubArray.maxSubArray(ar2));
        int[] ar3 = {5, 4, -1, 7, 8};
        System.out.println(maximumSubArray.maxSubArray(ar3));
    }

    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            sum += num;
            max = Math.max(max, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
