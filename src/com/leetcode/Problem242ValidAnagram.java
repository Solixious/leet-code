package com.leetcode;

public class Problem242ValidAnagram {

    public static void main(String[] args) {
        Problem242ValidAnagram validAnagram = new Problem242ValidAnagram();
        System.out.println(validAnagram.isAnagram("anagram", "nagaram"));
        System.out.println(validAnagram.isAnagram("rat", "car"));
    }
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int[] map = new int[26];
        for(int i = 0; i < s.length(); i++) {
            map[s.charAt(i) - 'a']++;
            map[t.charAt(i) - 'a']--;
        }
        for(int f : map) {
            if(f != 0)
                return false;
        }
        return true;
    }
}
