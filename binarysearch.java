package com;
	public class binarysearch {
	    public static void main(String[] args) {
	        int n = 6;
	        int arr[] = {5, 10, 15, 20, 25, 30};
	        int key = 20;

	        int left = 0, right = n - 1;
	        int result = -1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (arr[mid] == key) {
	                result = mid;
	                break;
	            } else if (arr[mid] < key) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }

	        System.out.println(result);
	    }
	}
