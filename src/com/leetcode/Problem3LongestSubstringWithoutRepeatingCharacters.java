package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 */

public class Problem3LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        Problem3LongestSubstringWithoutRepeatingCharacters repeatingCharacters =
                new Problem3LongestSubstringWithoutRepeatingCharacters();
        System.out.println(repeatingCharacters.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(repeatingCharacters.lengthOfLongestSubstring("bbbbb"));
        System.out.println(repeatingCharacters.lengthOfLongestSubstring("pwwkew"));
    }

    public int lengthOfLongestSubstring(String s) {
        int longestSubstringLength = 0;
        char[] ch = s.toCharArray();
        for(int i = 0; i < ch.length; i++) {
            Map<Character, Boolean> map = new HashMap<>();
            for(int j = i; j < ch.length; j++) {
                if(map.containsKey(ch[j])) {
                    break;
                } else if((j - i) + 1 > longestSubstringLength) {
                    longestSubstringLength = (j - i) + 1;
                }
                map.put(ch[j], true);
            }
        }

        return longestSubstringLength;
    }
}
