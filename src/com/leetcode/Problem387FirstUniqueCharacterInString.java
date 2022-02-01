package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Problem387FirstUniqueCharacterInString {

    public static void main(String[] args) {
        Problem387FirstUniqueCharacterInString firstUniqueCharacterInString = new Problem387FirstUniqueCharacterInString();
        System.out.println(firstUniqueCharacterInString.firstUniqChar("leetcode"));
        System.out.println(firstUniqueCharacterInString.firstUniqChar("loveleetcode"));
        System.out.println(firstUniqueCharacterInString.firstUniqChar("aabb"));
    }

    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray())
            map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
        for(int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}
