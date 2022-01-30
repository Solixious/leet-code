package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem118PascalsTriangle {
    public static void main(String[] args) {
        Problem118PascalsTriangle pascalsTriangle = new Problem118PascalsTriangle();
        List<List<Integer>> res = pascalsTriangle.generate(6);
        for(List<Integer> row : res) {
            for(Integer in : row) {
                System.out.print(in + " ");
            }
            System.out.println();
        }
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        res.add(firstRow);
        for(int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
                List<Integer> previousRow = res.get(i - 1);
                row.add((j == 0 ? 0 : previousRow.get(j - 1)) + (j == previousRow.size() ? 0 : previousRow.get(j)));
            }
            res.add(row);
        }
        return res;
    }
}
