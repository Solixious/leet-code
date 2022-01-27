package com.leetcode;

public class Problem278FirstBadVersion {

    public static void main(String[] args) {
        Problem278FirstBadVersion firstBadVersion = new Problem278FirstBadVersion();
        System.out.println(firstBadVersion.firstBadVersion(2126753390));

    }
    public int firstBadVersion(int n) {
        int u = n, l = 0, m = 0;
        while(u >= l) {
            m = l + ((u - l) / 2);
            if(isBadVersion(m)) {
                u = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }
    public boolean isBadVersion(int n) {
        return n >= 1702766719;
    }
}
