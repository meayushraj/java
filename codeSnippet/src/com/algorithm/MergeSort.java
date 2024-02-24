package com.algorithm;

public class MergeSort {
    int[] arr = {1, 4, 3, 5, 6, 35, 57, 345};


    void mergeSort(int[] arr, int low, int high) {
        System.out.println(low + "" + high);
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
    }

    <Array> void merge(int[] mergeArr, int low, int high) {
        int mid = low + (high - low) / 2;
        if (mid <= 0) {
            System.out.println("Stop at Base Condition");
            return;
        }
        merge(mergeArr, 0, mid-1);
        merge(mergeArr, mid+1, high);

    }

    public void printList() {
        merge(arr, 0, arr.length);
        System.out.println("Results :");
//        for (Integer i : arr) {
//            System.out.print(i + " ");
//        }

    }

}
