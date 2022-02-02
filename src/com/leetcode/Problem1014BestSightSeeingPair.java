package com.leetcode;

public class Problem1014BestSightSeeingPair {

    public static void main(String[] args) {
        Problem1014BestSightSeeingPair bestSightSeeingPair = new Problem1014BestSightSeeingPair();
        int[] ar = {1,2};
        System.out.println(bestSightSeeingPair.maxScoreSightseeingPair(ar));
    }
    public int maxScoreSightseeingPair(int[] values) {
        int maxPair = Integer.MIN_VALUE;
        int x = 0;
        for(int i = 1; i < values.length; i++) {
            int currentPair = values[x] + x + values[i] - i;
            maxPair = Math.max(maxPair, currentPair);
            if(values[x] + x < values[i] + i) {
                x = i;
            }
        }
        return  maxPair;
    }
}
