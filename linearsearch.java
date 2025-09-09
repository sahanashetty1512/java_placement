package com;

public class linearsearch {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60};  
        int n = arr.length;
        int key = 30;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }
        System.out.println(index); 
    }
}

