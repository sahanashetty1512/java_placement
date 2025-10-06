package com;
import java.util.Scanner;
public class fibonacci_series_1 {

    public static int fibonacci(int n) {
        if (n == 0) 
        {
        	return 0;
        }
        if (n == 1)
        {
        	return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc1.nextInt();
        System.out.println("Fibonacci series up to " + n + " terms is:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
