package com.leetcode;

public class Problem8StringToIntegerAToI {

    public static void main(String[] args) {
        Problem8StringToIntegerAToI aToI = new Problem8StringToIntegerAToI();
        System.out.println(aToI.myAtoi("42"));
        System.out.println(aToI.myAtoi("   -42"));
        System.out.println(aToI.myAtoi("4193 with words"));
    }

    public int myAtoi(String s) {
        if(s == null || s.trim().length() == 0) {
            return 0;
        }
        s = s.trim();
        int num = 0;
        boolean sign = false;
        int index = 0;
        if(s.charAt(0) == '-') {
            index++;
            sign = true;
        } else if(s.charAt(0) == '+') {
            index++;
        }

        while(index < s.length()) {
            char c = s.charAt(index);
            if(Character.isDigit(c)) {
                if(((long)num * 10) + (c - '0') <= (long)(Integer.MAX_VALUE)) {
                    num = (num * 10) + (c - '0');
                } else {
                    if(sign) {
                        return Integer.MIN_VALUE;
                    } else {
                        return Integer.MAX_VALUE;
                    }
                }
            }
            else {
                break;
            }
            index++;
        }
        if(sign) {
            num = -num;
        }
        return num;
    }
}
