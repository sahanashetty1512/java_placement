package com;

public class sum_of_array_1 {

    public static int sum(int[] arr, int i) {
        if (i==arr.length) 
        	{
        	return 0;
        	}
        return arr[i]+sum(arr,i+1);
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30};
        int sum = sum(arr,0);
        System.out.println("sum of array elements is " + sum);
    }
}
