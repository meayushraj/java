package com.leetcode.meayushraj;

public class LeetCodeMain {
    public static void main(String[] args) {
        Solution code = new Solution();
        code.showUserMessage();

        // Write Solution here
//        Solution125 solve = new Solution125();
//        System.out.println(solve.isPalindrome("A man, a plan, a canal: Panama"));
        Solution1838 solve = new Solution1838();
        int[] nums = new int[]{1, 4, 8, 13};
        solve.maxFrequency(nums, 5);

    }
}

