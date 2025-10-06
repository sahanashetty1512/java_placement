package com;

public class digit_count {
public static void main(String[] args)
{
	int count=0;
	int n=123;
	while(n!=0)
	{
		count++;
		n=n/10;
	}
	System.out.println("digit count is"+" "+count);
}
}
