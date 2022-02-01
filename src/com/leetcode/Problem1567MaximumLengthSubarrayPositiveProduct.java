package com.leetcode;

public class Problem1567MaximumLengthSubarrayPositiveProduct {
    public static void main(String[] args) {
        Problem1567MaximumLengthSubarrayPositiveProduct maximumLengthSubarrayPositiveProduct =
                new Problem1567MaximumLengthSubarrayPositiveProduct();
        int[] ar = {-1,-2,-3,0,1};
        System.out.println(maximumLengthSubarrayPositiveProduct.getMaxLen(ar));
    }
    public int getMaxLen(int[] nums) {
        int negativeCount = 0;
        int zeroIndex = -1;
        int firstNegativeIndex = -1;
        int maxLength = 0;

        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(num < 0) {
                negativeCount++;
                if(firstNegativeIndex == -1)
                    firstNegativeIndex = i;
            }
            if(num == 0) {
                negativeCount = 0;
                firstNegativeIndex = -1;
                zeroIndex = i;
            } else {
                 if(negativeCount % 2 == 0)
                     maxLength = Math.max(maxLength, i - zeroIndex);
                 else
                     maxLength = Math.max(maxLength, i - firstNegativeIndex);
            }
        }

        return maxLength;
    }
}
