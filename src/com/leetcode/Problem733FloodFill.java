package com.leetcode;

public class Problem733FloodFill {
    public static void main(String[] args) {
        Problem733FloodFill floodFill = new Problem733FloodFill();
        //int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int[][] image = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        floodFill.floodFill(image, 1, 1, 2);
        for(int i = 0; i < image.length; i++) {
            for(int j = 0; j < image[i].length; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int targetColor = image[sr][sc];
        if(newColor == targetColor) {
            return image;
        }
        return floodFill(image, sr, sc, targetColor, newColor);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int targetColor, int newColor) {
        if (image[sr][sc] == targetColor) {
            image[sr][sc] = newColor;
            if (sr - 1 >= 0) {
                image = floodFill(image, sr - 1, sc, targetColor, newColor);
            }
            if (sr + 1 < image.length) {
                image = floodFill(image, sr + 1, sc, targetColor, newColor);
            }
            if (sc - 1 >= 0) {
                image = floodFill(image, sr, sc - 1, targetColor, newColor);
            }
            if (sc + 1 < image[0].length) {
                image = floodFill(image, sr, sc + 1, targetColor, newColor);
            }
        }
        return image;
    }
}
