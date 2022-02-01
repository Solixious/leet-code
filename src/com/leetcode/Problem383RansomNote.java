package com.leetcode;

public class Problem383RansomNote {

    public static void main(String[] args) {
        Problem383RansomNote ransomNote = new Problem383RansomNote();
        System.out.println(ransomNote.canConstruct("a", "b"));
        System.out.println(ransomNote.canConstruct("aa", "ab"));
        System.out.println(ransomNote.canConstruct("aa", "aab"));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        for(char c : magazine.toCharArray())
            freq[c - 'a']++;
        for(char c: ransomNote.toCharArray())
            freq[c - 'a']--;
        for(int f : freq) {
            if(f < 0)
                return false;
        }
        return true;
    }
}
