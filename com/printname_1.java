package com;

public class printname_1 {

    public static void print(int i) {
        if (i>=5) 
        	{
        	return;
        	}
        System.out.println("Sahana shetty");
        print(i + 1);
    }

    public static void main(String[] args) {
        print(0);
    }
}
