package com;

public class student1 {
int id;
String name;
student1(int id,String name)
{
	this.id=id;
	this.name=name;
}
@Override
public String toString()
{
	return this.id+" "+this.name;
}
public static void main(String[] args)
{
	student1 s1=new student1(89,"sahana");
	student1 s2=new student1(90,"shetty");
	student1[] s=new student1[2];
	s[0]=s1;
	s[1]=s2;
	for(int i=0;i<s.length;i++)
	{
		System.out.println(s[i]);
	}
}
}
