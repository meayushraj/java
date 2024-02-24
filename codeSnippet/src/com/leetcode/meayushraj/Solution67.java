package com.leetcode.meayushraj;

//https://leetcode.com/problems/add-binary/
public class Solution67 {
    public String addBinary(String a, String b) {
        String rst = "";
        int aLen = a.length() - 1;
        int bLen = b.length() - 1;
        int x = 0, y = 0, carry = 0;
//
//        if (Math.max(aLen, bLen) == 0) {
//            if (a.charAt(aLen) == '0' && b.charAt(bLen) == '0') return "0";
//            if (a.charAt(aLen) == '0' && b.charAt(bLen) == '1') return "1";
//            if (a.charAt(aLen) == '1' && b.charAt(bLen) == '0') return "1";
//        }

        while (aLen >= 0 || bLen >= 0) {
            if (aLen >= 0) {
                x = Integer.parseInt(String.valueOf(a.charAt(aLen)));
            } else x = 0;
            if (bLen >= 0) {
                y = Integer.parseInt(String.valueOf(b.charAt(bLen)));
            } else y = 0;

            if ((x + y + carry) % 2 == 0) {
                rst = "0" + rst;
                carry = 1;
            } else {
                rst = "1" + rst;
                carry = 0;
            }
            aLen--;
            bLen--;
        }
        return carry + rst;
    }
}
