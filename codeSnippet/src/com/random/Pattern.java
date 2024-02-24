package com.random;

public class Pattern {

    public static void nTriangle(int n) {
        // Write your code here
        for (int i = 1; i < n; i++) {
            System.out.println();
            for (int j = 1; j < i; j++) System.out.print(j);
        }
    }

    public static void nNumberTriangle(int n) {
        for (int i = n; i > 0; i--) {
            System.out.println();
            for (int j = 1; j <= i; j++) System.out.print(j);
        }
    }

    public void halfSymmetry(int n) {
        int mid = n / 2 - 1;
        for (int i = 0; i < n; i++, System.out.println()) {
            for (int j = mid; j >= i; j--) {
                System.out.print('*');
            }
            for (int k = 0; k < i - mid; k++) {
                System.out.print('*');
            }
        }
    }

    public void symmetry(int n) {
        int mid = n / 2;
        int cnt = 0;
        for (int i = 0; i < n; i++, System.out.println(), cnt++) {
            for (int j = n; j >= 0; j--) {
                if (j == mid) {
                    System.out.print(" ");
                } else {
                    System.out.print('*');
                }
            }
        }
    }
}