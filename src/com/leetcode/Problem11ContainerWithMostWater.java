package com.leetcode;

public class Problem11ContainerWithMostWater {

    public static void main(String[] args) {
        Problem11ContainerWithMostWater containerWithMostWater = new Problem11ContainerWithMostWater();
        System.out.println(containerWithMostWater.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

    public int maxArea(int[] height) {
        int maxArea = 0;
        int start = 0, end = height.length - 1;
        while(start < end) {
            int h = Math.min(height[start], height[end]);
            int area = h * (end - start);
            if(area > maxArea) {
                maxArea = area;
            }
            while (height[start] <= h && start < end) start++;
            while (height[end] <= h && start < end) end--;
        }
        return maxArea;
    }
}
