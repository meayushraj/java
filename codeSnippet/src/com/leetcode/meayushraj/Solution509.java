package com.leetcode.meayushraj;

//https://leetcode.com/problems/fibonacci-number/

import java.util.HashMap;
import java.util.Map;

public class Solution509 {
    public int fibFromMemoization(int n) {
        return fibMemo(n, new HashMap<Integer, Integer>());
    }

    private int fibMemo(int n, Map<Integer, Integer> map) {
        if (map.containsKey(n)) return map.get(n);
        int result = 0;
        if (n <= 1) return n;
        else result = fibMemo(n - 1, map) + fibMemo(n - 2, map);
        map.put(n, result);
        return result;
    }


    public int fib(int n) {
        return (int) ((Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n)) / Math.sqrt(5));
//        if (n <= 0) return 0;
//        if (n == 1) return 1;
//        return fib(n - 1) + fib(n - 2);
    }
}
