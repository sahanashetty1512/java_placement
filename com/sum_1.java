package com;

public class sum_1 {

    public static int Sum(int n) {
        if (n == 1) 
        {
        	return 1;
        }
        return n+Sum(n - 1);
    }

    public static void main(String[] args) {
        int result=Sum(10);
        System.out.println("sum of 1st 10 natural no is: " + result);
    }
}
