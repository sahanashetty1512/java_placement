package com;
import java.util.Scanner;
public class palindrome {
public static void main(String[] args)
{
	Scanner sc1=new Scanner(System.in);
	System.out.println("Enter a number");
	int originalno=sc1.nextInt();
	int num=originalno;
	int reverse=0;
	while(num!=0)
	{
		int m=num%10;
		reverse=reverse*10+m;
		num=num/10;
	}
	if(originalno==reverse)
	{
		System.out.println(originalno+" "+"is palindrome");
	}
	else
	{
		System.out.println(originalno+" "+"is not palindrome");
	}
	
}
}
