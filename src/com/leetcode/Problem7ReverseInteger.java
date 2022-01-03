package com.leetcode;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 */
public class Problem7ReverseInteger {

    public static void main(String[] args) {
        Problem7ReverseInteger reverseInteger = new Problem7ReverseInteger();
        System.out.println(reverseInteger.reverse(123));
        System.out.println(reverseInteger.reverse(-123));
        System.out.println(reverseInteger.reverse(120));
    }

    public int reverse(int x) {
        int temp = Math.abs(x);
        long rev = 0;

        while (temp > 0) {
            long remainder = temp % 10;
            rev = (rev * 10) + remainder;
            temp = temp / 10;
        }
        if(rev == (int)rev) {
            if(x >= 0)
                return (int) rev;
            else
                return (int)-rev;
        }
        return 0;
    }
}
