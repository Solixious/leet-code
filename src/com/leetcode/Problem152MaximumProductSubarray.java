package com.leetcode;

public class Problem152MaximumProductSubarray {

    public static void main(String[] args) {
        Problem152MaximumProductSubarray maximumProductSubarray = new Problem152MaximumProductSubarray();
        int[] ar = {2,3,-2,4};
        System.out.println(maximumProductSubarray.maxProduct(ar));
    }
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = maxProduct;
        for(int i = 1; i < nums.length; i++) {
            int current = nums[i];
            int tempMax = Math.max(current, Math.max(maxProduct * current, minProduct * current));
            minProduct = Math.min(current, Math.min(maxProduct * current, minProduct * current));
            maxProduct = tempMax;
            result = Math.max(result, maxProduct);
        }
        return result;
    }
}
