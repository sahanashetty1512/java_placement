package com;

public class exception {
	public static void main(String[] args) {
		System.out.println("Program starts");
		 int a=10;
		 int b=0;
		 try
		 {
			 System.out.println(a/b);
		 }catch (ArithmeticException e)
		 {
			 System.out.println("Divide by zero is not possible");
		 }
		 System.out.println("Program ends");

	}
}
