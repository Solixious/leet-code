package com.leetcode;

public class Problem14LongestCommonPrefix {

    public static void main(String[] args) {
        Problem14LongestCommonPrefix longestCommonPrefix = new Problem14LongestCommonPrefix();
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }

    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) {
            return "";
        }

        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            boolean match = true;
            for(int j = 1; j < strs.length; j++) {
                if(strs[j].length() > i && strs[j].charAt(i) == c) {
                    continue;
                }
                match = false;
            }
            if(!match) {
                break;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
