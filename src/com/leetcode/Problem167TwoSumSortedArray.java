package com.leetcode;

public class Problem167TwoSumSortedArray {

    public static void main(String[] args) {
        Problem167TwoSumSortedArray twoSum = new Problem167TwoSumSortedArray();
        int[] ar = {2, 7, 11, 15};
        int target = 9;
        int[] solution = twoSum.twoSum(ar, target);
        System.out.println(solution[0] + " " + solution[1]);
    }

    public int[] twoSum(int[] numbers, int target) {
        int low = 0, high = numbers.length - 1;
        while (low < high) {
            int m = numbers[low] + numbers[high];
            if (m < target) {
                low++;
            } else if (m > target) {
                high--;
            } else {
                return new int[]{low + 1, high + 1};
            }
        }
        return new int[]{-1, -1};
    }
}
