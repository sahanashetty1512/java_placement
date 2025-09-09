package com;
public class leftrotateanarray {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {10, 20, 30, 40, 50};
        int first = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = first;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

