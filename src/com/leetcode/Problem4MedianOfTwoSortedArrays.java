package com.leetcode;

/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 *
 * The overall run time complexity should be O(log (m+n)).
 */

public class Problem4MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        Problem4MedianOfTwoSortedArrays medianOfTwoSortedArrays = new Problem4MedianOfTwoSortedArrays();

        System.out.println(medianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
        System.out.println(medianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < nums1.length || j < nums2.length) {
            if(i < nums1.length && (j == nums2.length || nums1[i] < nums2[j])) {
                nums3[k] = nums1[i];
                i++;
            } else {
                nums3[k] = nums2[j];
                j++;
            }
            k++;
        }
        if(nums3.length % 2 == 1) {
            return nums3[nums3.length / 2];
        } else {
            return (nums3[nums3.length / 2] + nums3[(nums3.length / 2) - 1]) / 2.0d;
        }
    }
}
