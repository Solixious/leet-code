package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem6ZigZagConversion {

    public static void main(String[] args) {
        Problem6ZigZagConversion zigZagConversion = new Problem6ZigZagConversion();
        System.out.println(zigZagConversion.convert("PAYPALISHIRING", 4));
    }

    public String convert(String s, int numRows) {
        if(numRows == 1) {
            return s;
        }
        List<StringBuffer> list = new ArrayList<>();
        for(int i = 0; i < numRows; i++) {
            list.add(new StringBuffer());
        }

        boolean goingDown = true;
        int currentRow = 0;
        for(int i = 0; i < s.length(); i++) {
            list.get(currentRow).append(s.charAt(i));
            currentRow = currentRow + (goingDown ? 1 : -1);
            if(currentRow == numRows - 1 || currentRow == 0) {
                goingDown = ! goingDown;
            }
        }
        StringBuffer sb = new StringBuffer();
        for(StringBuffer fragment : list) {
            sb.append(fragment);
        }
        return sb.toString();
    }
}
