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
        System.out.println(repeatingCharacters.lengthOfLongestSubstring("abba"));
    }

    public int lengthOfLongestSubstring(String s) {
        int longestSubstringLength = 0;
        char[] ch = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(int end = 0, start = 0; end < ch.length; end++) {
            if(map.containsKey(ch[end])) {
                start = Math.max(start, map.get(ch[end]) + 1);
            }
            longestSubstringLength = Math.max(longestSubstringLength, (end - start) + 1);
            map.put(ch[end], end);
        }
        return longestSubstringLength;
    }
}
