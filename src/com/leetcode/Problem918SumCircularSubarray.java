package com.leetcode;

public class Problem918SumCircularSubarray {

    public static void main(String[] args) {
        Problem918SumCircularSubarray circularSubarray = new Problem918SumCircularSubarray();
        int[] ar = {-3,-2,-3};
        System.out.println(circularSubarray.maxSubarraySumCircular(ar));
    }
    public int maxSubarraySumCircular(int[] nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int totalSum = 0, sum1 = 0, sum2 = 0;
        for(int num : nums) {
            totalSum += num;
            sum1 += num;
            sum2 += num;
            max = Math.max(max , sum1);
            min = Math.min(min, sum2);
            if(sum1 < 0) {
                sum1 = 0;
            }
            if(sum2 > 0) {
                sum2 = 0;
            }
        }
        if(totalSum == min) {
            return max;
        }
        return Math.max(max, totalSum - min);
    }
}
