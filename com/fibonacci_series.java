package com;
import java.util.Scanner;
public class fibonacci_series {
public static void main(String[] args)
{
	Scanner sc1=new Scanner(System.in);
	System.out.println("Enter the value of n");
	int n=sc1.nextInt();
	int a=0,b=1;
	System.out.println("Fibonacci series upto"+" "+n+" "+"is");
	for(int i=1;i<=n;i++)
	{
		System.out.print(a+" ");
		int c=a+b;
		a=b;
		b=c;
	}
}
}
