package com;
public class diagnolsum {
    public static void main(String[] args) {
        int n = 3;
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int primary = 0, secondary = 0;
        for (int i = 0; i < n; i++) {
            primary += a[i][i];
            secondary += a[i][n - 1 - i];
        }

        System.out.println("Primary Diagonal Sum: " + primary);
        System.out.println("Secondary Diagonal Sum: " + secondary);
    }
}
