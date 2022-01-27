package com.leetcode;

public class Problem35SearchInsertPosition {

    public static void main(String[] args) {
        Problem35SearchInsertPosition searchInsertPosition = new Problem35SearchInsertPosition();
        int[] ar = {1,3,5,6};
        System.out.println(searchInsertPosition.searchInsert(ar, 5));
        System.out.println(searchInsertPosition.searchInsert(ar, 2));
        System.out.println(searchInsertPosition.searchInsert(ar, 7));
    }

    public int searchInsert(int[] nums, int target) {
        int l = 0, u = nums.length, m = 0;
        while(l < u) {
            m = (l + u) / 2;
            if(nums[m] < target) {
                l = m + 1;
            } else if(nums[m] > target) {
                u = m - 1;
            } else {
                return m;
            }
        }
        return l;
    }
}
