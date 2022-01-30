package com.leetcode;

public class Problem557ReverseWordsInStringThree {

    public static void main(String[] args) {
        Problem557ReverseWordsInStringThree reverseWordsInStringThree = new Problem557ReverseWordsInStringThree();
        System.out.println(reverseWordsInStringThree.reverseWords("Let's take LeetCode contest"));
    }
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuffer sb = new StringBuffer();
        sb.append(reverse(words[0]));
        for(int i = 1; i < words.length; i++) {
            sb.append(" " + reverse(words[i]));
        }
        return new String(sb);
    }
    private String reverse(String s) {
        char[] c = s.toCharArray();
        for(int i = 0; i < c.length / 2; i++) {
            char temp = c[i];
            c[i] = c[c.length - i - 1];
            c[c.length - i - 1] = temp;
        }
        return new String(c);
    }
}
