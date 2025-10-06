package com;
import java.util.Scanner;
public class palindrome_string {
public static void main(String[] args)
{
	Scanner sc1=new Scanner(System.in);
	System.out.println("Enter a string");
	String org=sc1.nextLine();
	String reverse=new StringBuilder(org).reverse().toString();
	if(org.equals(reverse))
	{
		System.out.println(org+" "+"is palindrome");
	}
	else
	{
		System.out.println(org+" "+"is not palindrome");
	}
	
}
}
