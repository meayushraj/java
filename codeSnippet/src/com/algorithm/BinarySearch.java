package com.algorithm;

public class BinarySearch {

    public static void main(String args[]) {
        BinarySearch ob = new BinarySearch();
        int array[] = {3, 4, 5, 6, 7, 8, 9};
        int n = array.length;
        int x = 9;
        int result = ob.binaryRecursiveSearch(array, x, 0, n - 1);
        int result2 = ob.binaryIterativeSearch(array, x, 0, n - 1);
        if (result == -1) System.out.println("Not found");
        else System.out.println("Element found at index " + result + ", " + result2);
    }

    private int binaryRecursiveSearch(int array[], int x, int low, int high) {
        //    Recursive Method
        int mid = low + (high - low) / 2;
        if (array[mid] == x) return mid;
        if (array[mid] > x) return binaryRecursiveSearch(array, x, low, mid - 1);
        if (array[mid] < x) return binaryRecursiveSearch(array, x, mid + 1, high);
        return -1;
    }


    private int binaryIterativeSearch(int array[], int x, int low, int high) {
        int mid = low + (high - low) / 2;
        while (low >= 0 && high < array.length) {
            mid = low + (high - low) / 2;
            if (array[mid] == x) return mid;
            if (x < array[mid]) {
                high = mid;
            }
            if (x > array[mid]) {
                low = mid + 1;
            }
        }
        return mid;
    }
}