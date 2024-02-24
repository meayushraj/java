package com.leetcode.meayushraj;

//https://leetcode.com/problems/reverse-integer/
public class Solution7 {
    public int reverse(int x) {
        int sum = 0, mul = 1, copy = x;
        boolean negativeFlag = false;

        if (x < 0) {
            negativeFlag = true;
            x = 0 - x;
            copy = x;
        }

        while (copy >= 10) {
            mul *= 10;
            copy /= 10;
        }

        while (x > 0) {
            int mod = x % 10;
            int div = x / 10;
            sum += mod * mul;
            x = x / 10;
            mul /= 10;
        }

        if (negativeFlag) sum = 0 - sum;

        return sum;
    }


    public int reverseMath(int x) {
        int y = Math.abs(x);
        int sum = 0;
        while (y > 0) {
            int mod = y % 10;
            sum = sum * 10 + mod;
            y = y / 10;
        }
        return x > 0 ? sum : -sum;
    }
}
