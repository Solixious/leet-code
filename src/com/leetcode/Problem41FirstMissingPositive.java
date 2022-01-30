package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Problem41FirstMissingPositive {

    public static void main(String[] args) {
        Problem41FirstMissingPositive firstMissingPositive = new Problem41FirstMissingPositive();
        int[] ar = {7,8,9,11,12};
        System.out.println(firstMissingPositive.firstMissingPositive(ar));
    }
    public int firstMissingPositive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, 1);
        }
        int ctr = 1;
        while(map.containsKey(ctr)) {
            ctr++;
        }
        return ctr;
    }
}
