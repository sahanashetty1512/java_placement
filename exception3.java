package com;

public class exception3 {
	public static void main(String[] args) {
		System.out.println("Program starts");
		 String s="sah";
		 try
		 {
			 System.out.println(s.charAt(0));
			 System.out.println(s.charAt(1));
			 System.out.println(s.charAt(2));
			 System.out.println(s.charAt(3));
		 }
		 catch(StringIndexOutOfBoundsException e)
		 {
			 System.out.println("Trying access invalid index");
		 }
		 System.out.println("Program ends");

	}
}
