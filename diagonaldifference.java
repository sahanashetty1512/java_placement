package com;
public class diagonaldifference {
    public static void main(String[] args) {
        int n = 3;
        int[][] a = {
            {11, 2, 4},
            {4, 5, 6},
            {10, 8, -12}
        };

        int primary = 0, secondary = 0;
        for (int i = 0; i < n; i++) {
            primary += a[i][i];
            secondary += a[i][n - 1 - i];
        }

        int diff = Math.abs(primary - secondary);
        System.out.println(diff);
    }
}

