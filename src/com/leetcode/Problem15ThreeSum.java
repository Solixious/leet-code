package com.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class Problem15ThreeSum {

    public static void main(String[] args) {
        Problem15ThreeSum threeSum = new Problem15ThreeSum();
        System.out.println(threeSum.threeSum(new int[]{-1,0,1,2,-1,-4}));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length && nums[i] <= 0; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int target = -nums[i];
            int lo = i + 1;
            int hi = nums.length - 1;
            while(lo < hi) {
                if(nums[lo] + nums[hi] == target) {
                    List<Integer> list = Arrays.asList(nums[i], nums[lo], nums[hi]);
                    if((lo > 0 && nums[lo] == nums[lo - 1]) && (hi < nums.length - 1 && nums[hi] == nums[hi + 1])) {
                        lo++;
                        hi--;
                        continue;
                    }
                    lists.add(list);
                    lo++;
                    hi--;
                }
                else if(nums[lo] + nums[hi] < target) {
                    lo++;
                } else {
                    hi--;
                }
            }
        }
        return lists;
    }
}
