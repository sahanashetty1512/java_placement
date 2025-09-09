package com;

public class rightrotateanarray {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {10, 20, 30, 40, 50};
        int last = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

