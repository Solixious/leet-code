package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem350IntersectionOfTwoArrays {

    public static void main(String[] args) {
        Problem350IntersectionOfTwoArrays intersectionOfTwoArrays = new Problem350IntersectionOfTwoArrays();
        int[] ar1 = {4,9,5};
        int[] ar2 = {9,4,9,8,4};
        int[] intersection = intersectionOfTwoArrays.intersect(ar1, ar2);
        for(int num : intersection) {
            System.out.print(num + " ");
        }
    }
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> intersection = new ArrayList<>();
        int m = 0, n = 0;
        while(m < nums1.length && n < nums2.length) {
            if(nums1[m] > nums2[n]) {
                n++;
            } else if(nums1[m] < nums2[n]) {
                m++;
            } else {
                intersection.add(nums1[m]);
                m++;
                n++;
            }
        }
        int[] in = new int[intersection.size()];
        int i = 0;
        for(int a : intersection) {
            in[i++] = a;
        }
        return in;
    }
}
