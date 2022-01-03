package com.leetcode;

public class Problem9PalindromeNumber {

    public static void main(String[] args) {
        Problem9PalindromeNumber palindromeNumber = new Problem9PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(121));
        System.out.println(palindromeNumber.isPalindrome(-121));
        System.out.println(palindromeNumber.isPalindrome(10));
    }

    public boolean isPalindrome(int x) {
        int rev = 0;
        int temp = x;

        while(temp > 0) {
            int remainder = temp % 10;
            rev = (rev * 10) + remainder;
            temp = temp / 10;
        }
        return x == rev;
    }
}
