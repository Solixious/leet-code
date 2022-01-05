package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 */

public class Problem1TwoSum {

    public static void main(String[] args) {
        Problem1TwoSum twoSum = new Problem1TwoSum();

        int[] sol1 = twoSum.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(sol1[0] + ", " + sol1[1]);

        int[] sol2 = twoSum.twoSum(new int[]{3, 2, 4}, 6);
        System.out.println(sol2[0] + ", " + sol2[1]);

        int[] sol3 = twoSum.twoSum(new int[]{3, 3}, 6);
        System.out.println(sol3[0] + ", " + sol3[1]);

    }

    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < numbers.length; i++) {
            if(map.containsKey(target - numbers[i])) {
                return new int[]{i, map.get(target - numbers[i])};
            }
            map.put(numbers[i], i);
        }
        return new int[]{0, 0};
    }
}
