package com.leetcode.meayushraj;

//https://leetcode.com/problems/length-of-last-word/
public class Solution58 {
    public int lengthOfLastWord(String s) {
        int c = 0;
        String s1 = s.trim();
        for (int i = s1.length() - 1; i >= 0; i--) {
            if (s1.charAt(i) != ' ') {
                c++;
            } else break;
        }
        return c;
    }
}
