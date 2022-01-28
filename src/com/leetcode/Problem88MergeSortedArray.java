package com.leetcode;

public class Problem88MergeSortedArray {

    public static void main(String[] args) {
        Problem88MergeSortedArray mergeSortedArray = new Problem88MergeSortedArray();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        mergeSortedArray.merge(nums1, m, nums2, n);
        for(int num : nums1) {
            System.out.print(num + " ");
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
        for (int i = m + n + 1; i >= 0; i--) {
            if (n == -1 || (m >= 0 && nums1[m] > nums2[n])) {
                nums1[i] = nums1[m];
                m--;
            } else if (n >= 0) {
                nums1[i] = nums2[n];
                n--;
            }
        }
    }
}
