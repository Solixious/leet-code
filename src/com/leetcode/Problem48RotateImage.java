package com.leetcode;

public class Problem48RotateImage {

    public static void main(String[] args) {
        Problem48RotateImage rotateImage = new Problem48RotateImage();
        int[][] ar = {  {1,2,3},
                        {4,5,6},
                        {7,8,9}};
        rotateImage.display(ar);
        rotateImage.rotate(ar);
        rotateImage.display(ar);
    }
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        if(n <= 1) {
            return;
        }
        for(int i = 0; i < n / 2; i++) {
            for(int j = i; j < n - i - 1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = temp;
            }
        }
    }
    public void display(int[][] ar) {
        for(int i = 0; i < ar.length; i++) {
            for(int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
