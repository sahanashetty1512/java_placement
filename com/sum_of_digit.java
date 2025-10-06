package com;

public class sum_of_digit {
public static void main(String[] args)
{
	int sum=0;
	int n=123;
	while(n!=0)
	{
		int i=n%10;
		sum=sum+i;
		n=n/10;
	}
	System.out.println("sum of digit is"+" "+sum);
}
}
