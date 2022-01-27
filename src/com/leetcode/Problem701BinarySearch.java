package com.leetcode;

public class Problem701BinarySearch {

    public static void main(String[] args) {
        Problem701BinarySearch binarySearch = new Problem701BinarySearch();
        int[] ar = {-1, 0, 3, 5, 9, 12};
        System.out.println(binarySearch.search(ar, 9));
        System.out.println(binarySearch.search(ar, 2));
    }

    public int search(int[] nums, int target) {
        int l = 0, u = nums.length - 1, m = 0;
        while (l <= u) {
            m = (l + u) / 2;
            if (nums[m] > target) {
                u = m - 1;
            } else if (nums[m] < target) {
                l = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }
}
