package com.leetcode;

public class Problem977SquaresOfSortedArray {

    public static void main(String[] args) {
        Problem977SquaresOfSortedArray squaresOfSortedArray = new Problem977SquaresOfSortedArray();
        int[] ar = {-4,-1,0,3,10};
        int[] res = squaresOfSortedArray.sortedSquares(ar);
        for(int num : res) {
            System.out.print(num + " ");
        }
    }

    public int[] sortedSquares(int[] nums) {
        int[] sq = new int[nums.length];
        int low = 0, high = nums.length - 1;
        int ctr = nums.length - 1;
        while(low <= high) {
            if(nums[low] * nums[low] >= nums[high] * nums[high]) {
                sq[ctr--] = nums[low] * nums[low];
                low++;
            } else {
                sq[ctr--] = nums[high] * nums[high];
                high--;
            }
        }
        return sq;
    }
}
