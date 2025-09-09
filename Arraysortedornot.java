package com;

public class Arraysortedornot {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};  // Example input
        int n = arr.length;

        boolean sorted = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }

        if (sorted)
            System.out.println("Sorted");
        else
            System.out.println("Not Sorted");
    }
}
