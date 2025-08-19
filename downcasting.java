package com;

public class downcasting {
public static void main(String[] args) {
	//upcasting
	Daughter d=new Daughter();
	Mom m=d;
	System.out.println(m.name);
	//System.out.println(m.age);:Error:not able to access properties of subclass in upcasting
	//downcasting
	Daughter d1=(Daughter)m;
	System.out.println(d1.name);
	System.out.println(d1.age);
}
}
