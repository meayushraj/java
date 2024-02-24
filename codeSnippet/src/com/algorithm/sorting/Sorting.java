package com.algorithm.sorting;

import java.util.Arrays;

public class Sorting {
    static void printSorting() {
        System.out.println("Before Sorting...");
        System.out.println(Arrays.toString(array_first));
        System.out.println("\nResult After Sorting:");
    }

    private void swap(int[] targetArray, int from, int destination) {
        int tempArray = targetArray[from];
        targetArray[from] = targetArray[destination];
        targetArray[destination] = tempArray;

    }

    static int[] array_first = {5, -2, 23, 7, 87, -42, -509};
    static int[] array_second = {13, 7, 6, 45, 21, 9, 101, 102};
    int array_size_first = array_first.length;

    public void selectionSort() {
        for (int i = 0; i < array_size_first - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < array_size_first; j++) {
                if (array_first[j] < array_first[min_idx]) {
                    min_idx = j;
                }
            }
            swap(array_first, i, min_idx);
        }
        System.out.println(Arrays.toString(array_first));

    }

    public void bubbleSort() {
        for (int i = 0; i < array_size_first - 1; i++) {
            for (int j = 0; j < array_size_first - i - 1; j++) {
                if (array_first[i] > array_first[j]) {
                    swap(array_first, i, j);
                }
            }
        }
        System.out.println(Arrays.toString(array_first));
    }


    public void insertionSort() {

        for (int i = 0; i < array_size_first - 1; i++) {
            int key = array_first[i + 1];
            for (int j = 0; j < array_size_first - 1; j++) {
                if (key > array_first[j]) {
                    swap(array_first, i, j);
                } else {
                    swap(array_first, j, i);
                }
            }
        }
        System.out.println(Arrays.toString(array_first));

    }
}