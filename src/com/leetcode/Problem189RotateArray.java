package com.leetcode;

public class Problem189RotateArray {

    public static void main(String[] args) {
        Problem189RotateArray rotateArray = new Problem189RotateArray();
        int[] ar = {1,2,3,4,5,6,7};
        int k = 3;
        rotateArray.rotate(ar, k);
        for(int num : ar) {
            System.out.print(num + " ");
        }
    }
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] alt = new int[k];

        for(int i = nums.length - k; i < nums.length; i++) {
            alt[i - (nums.length - k)] = nums[i];
        }

        for(int i = nums.length - 1; i >= 0; i--) {
            if(i - k >= 0)
                nums[i] = nums[i - k];
            else
                nums[i] = alt[i];
        }
    }
}
