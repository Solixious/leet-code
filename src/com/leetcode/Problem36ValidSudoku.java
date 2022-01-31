package com.leetcode;

import java.util.HashMap;

public class Problem36ValidSudoku {

    public static void main(String[] args) {
        Problem36ValidSudoku validSudoku = new Problem36ValidSudoku();
        char[][] board = {{'5','3','.','.','7','.','.','.','.'},
                        {'6','.','.','1','9','5','.','.','.'},
                        {'.','9','8','.','.','.','.','6','.'},
                        {'8','.','.','.','6','.','.','.','3'},
                        {'4','.','.','8','.','3','.','.','1'},
                        {'7','.','.','.','2','.','.','.','6'},
                        {'.','6','.','.','.','.','2','8','.'},
                        {'.','.','.','4','1','9','.','.','5'},
                        {'.','.','.','.','8','.','.','7','9'}};
        System.out.println(validSudoku.isValidSudoku(board));
    }
    public boolean isValidSudoku(char[][] board) {
        // Check rows & columns
        for(int i = 0; i < 9; i++) {
            HashMap<Character, Boolean> mapRow = new HashMap<>();
            HashMap<Character, Boolean> mapCol = new HashMap<>();
            for(int j = 0; j < 9; j++) {
                char cRow = board[i][j];
                char cCol = board[j][i];
                if(mapRow.containsKey(cRow) || mapCol.containsKey(cCol)) {
                    return false;
                }
                if(Character.isDigit(cRow)) {
                    mapRow.put(cRow, true);
                }
                if(Character.isDigit(cCol)) {
                    mapCol.put(cCol, true);
                }
            }
        }
        // Check grids
        for(int a = 0; a < 9; a += 3) {
            for(int b = 0; b < 9; b += 3) {
                HashMap<Character, Boolean> map = new HashMap<>();
                for(int i = a; i < a + 3; i++) {
                    for(int j = b; j < b + 3; j++) {
                        char c = board[i][j];
                        if(map.containsKey(c)) {
                            return false;
                        }
                        if(Character.isDigit(c)) {
                            map.put(c, true);
                        }
                    }
                }
            }
        }
        return true;
    }
}
