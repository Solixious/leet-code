package com.leetcode;

public class Problem283MoveZeroes {

    public static void main(String[] args) {
        Problem283MoveZeroes moveZeroes = new Problem283MoveZeroes();
        int[] ar = {0,1,0,3,12};
        moveZeroes.moveZeroes(ar);
        for(int num : ar) {
            System.out.print(num + " ");
        }
    }
    public void moveZeroes(int[] nums) {
        for(int i = nums.length - 1; i >= 0; i--) {
            if(nums[i] == 0) {
                for(int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[nums.length - 1] = 0;
            }
        }
    }
}
