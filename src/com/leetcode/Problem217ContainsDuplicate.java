package com.leetcode;

import java.util.HashMap;

public class Problem217ContainsDuplicate {

    public static void main(String[] args) {
        Problem217ContainsDuplicate containsDuplicate = new Problem217ContainsDuplicate();
        int ar[] = {1, 2, 3, 1};
        System.out.println(containsDuplicate.containsDuplicate(ar));
        int ar2[] = {1, 2, 3, 4};
        System.out.println(containsDuplicate.containsDuplicate(ar2));
        int ar3[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containsDuplicate.containsDuplicate(ar3));
    }

    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                return true;
            }
            map.put(num, 1);
        }
        return false;
    }
}
