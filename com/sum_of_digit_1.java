package com;

public class sum_of_digit_1 {
    public static int sum(int n) {
        if (n == 0) 
        	{
        	return 0;
        	}
        return (n % 10)+sum(n / 10);
    }
    public static void main(String[] args) {
        int n = 123;
        int sum = sum(n);
        System.out.println("sum of digit is " + sum);
    }
}
