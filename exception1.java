package com;

public class exception1 {
	public static void main(String[] args) {
		System.out.println("Program starts");
		 int[] a= {10,20,30};
		 try
		 {
			 System.out.println(a[0]);
			 System.out.println(a[1]);
			 System.out.println(a[2]);
			 System.out.println(a[3]);
		 }
		 catch(ArrayIndexOutOfBoundsException e)
		 {
			 System.out.println("Trying access invalid index");
		 }
		 System.out.println("Program ends");

	}
}
