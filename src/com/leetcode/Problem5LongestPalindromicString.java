package com.leetcode;

/**
 * Given a string s, return the longest palindromic substring in s.
 */
public class Problem5LongestPalindromicString {

    public static void main(String[] args) {
        Problem5LongestPalindromicString longestPalindromicString = new Problem5LongestPalindromicString();

        System.out.println(longestPalindromicString.longestPalindrome("babad"));
        System.out.println(longestPalindromicString.longestPalindrome("cbbd"));
        System.out.println(longestPalindromicString.longestPalindrome("a"));
    }

    public String longestPalindrome(String s) {

        if(s.length() == 1) {
            return s;
        }

        String longestPalindrome = null;
        int longestLength = 0;
        for(int i = 0; i < s.length() - 1; i++) {
            String str1 = extend(s, i, i);
            String str2 = extend(s, i, i + 1);
            if(str1.length() > longestLength) {
                longestLength = str1.length();
                longestPalindrome = str1;
            }
            if(str2.length() > longestLength) {
                longestLength = str2.length();
                longestPalindrome = str2;
            }
        }
        return longestPalindrome;
    }
    private String extend(String s, int a, int b) {
        if(s.charAt(a) != s.charAt(b)) {
            return "";
        }
        while( a >= 0 && b < s.length() && s.charAt(a) == s.charAt(b)) {
            a--;
            b++;
        }
        return s.substring(a + 1, b);
    }
}
