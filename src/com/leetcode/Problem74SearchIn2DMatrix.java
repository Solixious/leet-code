package com.leetcode;

public class Problem74SearchIn2DMatrix {

    public static void main(String[] args) {
        Problem74SearchIn2DMatrix searchIn2DMatrix = new Problem74SearchIn2DMatrix();
        //int[][] ar = {{1,3,5,7}, {10,11,16,20},{23,30,34,60}};
        int[][] ar = {{1}};
        System.out.println(searchIn2DMatrix.searchMatrix(ar, 60));
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int high = m - 1;
        int low = 0;
        while(high > low) {
            int mid = low + ((high - low) / 2);
            if(matrix[mid][0] < target && matrix[mid][n - 1] < target) {
                low = mid + 1;
            } else if(matrix[mid][0] > target) {
                high = mid - 1;
            } else if (matrix[mid][0] <= target && matrix[mid][n - 1] >= target) {
                low = mid;
                break;
            }
        }
        int row = low;
        low = 0;
        high = n - 1;
        while (high >= low) {
            int mid = low + ((high - low) / 2);
            if(matrix[row][mid] < target) {
                low = mid + 1;
            } else if(matrix[row][mid] > target) {
                high = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
