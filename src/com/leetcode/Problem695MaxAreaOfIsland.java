package com.leetcode;

public class Problem695MaxAreaOfIsland {

    public static void main(String[] args) {
        Problem695MaxAreaOfIsland maxAreaOfIsland = new Problem695MaxAreaOfIsland();
        int[][] ar = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}};
        //int[][] ar = {{0,0,0,0,0,0,0,0,0}};

        System.out.println(maxAreaOfIsland.maxAreaOfIsland(ar));
    }
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        int[] islandStart = null;
        while((islandStart = getIslandLocation(grid)) != null) {
            int area = floodFill(grid, (int) islandStart[0], (int) islandStart[1], 1, 2, 0);
            if(area > maxArea)
                maxArea = area;
        }
        return maxArea;
    }
    private int[] getIslandLocation(int[][] grid) {
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 1) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
    public int floodFill(int[][] grid, int x, int y, int targetColor, int newColor, int count) {
        if (grid[x][y] == targetColor) {
            grid[x][y] = newColor;
            count += 1;
            if (x - 1 >= 0) {
                count = floodFill(grid, x - 1, y, targetColor, newColor, count);
            }
            if (x + 1 < grid.length) {
                count = floodFill(grid, x + 1, y, targetColor, newColor, count);
            }
            if (y - 1 >= 0) {
                count = floodFill(grid, x, y - 1, targetColor, newColor, count);
            }
            if (y + 1 < grid[0].length) {
                count = floodFill(grid, x, y + 1, targetColor, newColor, count);
            }
        }
        return count;
    }
}
