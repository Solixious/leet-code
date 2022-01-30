package com.leetcode;

public class Problem344ReverseString {

    public static void main(String[] args) {
        Problem344ReverseString reverseString = new Problem344ReverseString();
        char[] ch = {'h', 'e', 'l', 'l', 'o'};
        reverseString.reverseString(ch);
        System.out.println(new String(ch));
    }
    public void reverseString(char[] s) {
        int length = s.length / 2;
        for(int i = 0; i < length; i++) {
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
    }
}
