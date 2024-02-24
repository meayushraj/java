package com.random;

import java.util.HashMap;

public class Hashing {

    public static int[] countFrequency(int n, int x, int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>(0, x);

        // Write your code here.
        for (int i = 0; i < n; i++) {
            int val = nums[i];
            if (hashMap.containsKey(val)) {
                int count = hashMap.get(val);
                hashMap.put(nums[i], count + 1);
            } else hashMap.put(nums[i], 1);
        }

        System.out.println(hashMap);

        // printing out from hashmap
        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            if (hashMap.containsKey(i)) {
                arr[i - 1] = hashMap.get(i);
            }
        }
        for (int elements : arr) {
            System.out.println(elements);
        }
        return arr;
    }
}