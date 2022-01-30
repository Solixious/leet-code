package com.leetcode;

public class Problem566ReshapeTheMatrix {

    public static void main(String[] args) {
        Problem566ReshapeTheMatrix reshapeTheMatrix = new Problem566ReshapeTheMatrix();
        int[][] ar = {{1,2}, {3,4}};
        int res[][] = reshapeTheMatrix.matrixReshape(ar, 1, 4);
        for(int i = 0; i < res.length; i++) {
            for(int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(m * n != r * c) {
            return mat;
        }
        int rd = 0, cd = 0;
        int[][] res = new int[r][c];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                res[rd][cd] = mat[i][j];
                cd++;
                if(cd == c) {
                    cd = 0;
                    rd++;
                }
            }
        }
        return res;
    }
}
