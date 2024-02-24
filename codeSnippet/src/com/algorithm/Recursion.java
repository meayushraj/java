package com.algorithm;

import java.util.HashMap;

public class Recursion {
    HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

    private int factorial(int i) {
        if (i <= 1) return 1;
        return i * factorial(i - 1);
    }

    public void getFactorial(int n) {
        System.out.println(factorial(n));
    }

    private Integer factorialMemo(int i, HashMap<Integer, Integer> hashMap) {
        if (i <= 1) return 1;
        if (hashMap.containsKey(i)) {
            return hashMap.get(i);
        }
        int result = i * factorial(i - 1);
        hashMap.put(i, result);
        return result;
    }

    public void getFactorialFromMemoization(int i) {
        System.out.println(factorialMemo(i, hashMap));
        System.out.println(hashMap);
    }


    private int start = 1;

    private void recursivelyCallForPrintLinearlyN(int n) {
        if (start > n) return;
        System.out.println(start++);
        recursivelyCallForPrintLinearlyN( n);
    }

    public void printLinearlyN(int n) {
        recursivelyCallForPrintLinearlyN( n);
    }
}
