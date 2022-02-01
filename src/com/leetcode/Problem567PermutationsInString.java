package com.leetcode;

public class Problem567PermutationsInString {

    public static void main(String[] args) {
        Problem567PermutationsInString permutationsInString = new Problem567PermutationsInString();
        System.out.println(permutationsInString.checkInclusion("ab","eidbaooo"));
    }

    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) {
            return false;
        }
        int[] map1 = new int[26];
        for (char c : s1.toCharArray()) {
            map1[c - 'a']++;
        }

        int[] map2 = new int[26];
        for(int i = 0; i < s1.length(); i++) {
            map2[s2.charAt(i) - 'a']++;
        }
        int low = 0, high = s1.length();
        if(isMapEqual(map1, map2)) {
            return true;
        }
        while(high < s2.length()) {
            map2[s2.charAt(low++) - 'a']--;
            map2[s2.charAt(high++) - 'a']++;
            if(isMapEqual(map1, map2)) {
                return true;
            }
        }
        return false;
    }
    private boolean isMapEqual(int[] map1, int[] map2) {
        for(int i = 0; i < 26; i++) {
            if(map1[i] == map2[i]) {
                continue;
            }
            return false;
        }
        return true;
    }
}
