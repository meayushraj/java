package com.leetcode.meayushraj;

public class Solution9 {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int _x = x;

        int sum = 0;
        while (x > 0) {
            int mod = x % 10;
            sum = sum * 10 + mod;
            x = x / 10;
        }

        return sum == _x;
    }
}
