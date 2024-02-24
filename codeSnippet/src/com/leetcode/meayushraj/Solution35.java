package com.leetcode.meayushraj;

//    https://leetcode.com/problems/search-insert-position/
public class Solution35 {
    public int searchInsert(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length - 1;
        return findMid(startIndex, endIndex, nums, target);
    }

    static int findMid(int i, int j, int[] arr, int target) {
        int mid = i + (j - i) / 2;
        if (target == arr[mid]) return mid;

        if (i == j) {
            return arr[mid] > target ? mid : mid + 1;
        }
        if (target < arr[mid]) {
            return findMid(i, mid, arr, target);
        }
        if ((target > arr[mid])) {
            return findMid(mid + 1, j, arr, target);
        }
        return mid;
    }
}
