package com;

public class student {
int id;
String name;
student(int id,String name)
{
	this.id=id;
	this.name=name;
}
public static void main(String[] args)
{
	student s1=new student(89,"sahana");
	student s2=new student(90,"shetty");
	student[] s=new student[2];
	s[0]=s1;
	s[1]=s2;
	for(int i=0;i<s.length;i++)
	{
		System.out.println(s[i].id+" "+s[i].name);
	}
}
}
