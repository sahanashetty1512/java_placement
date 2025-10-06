package com;

public class evenno_1 {

    public static void printEven(int i) {
        if (i > 10) 
        	{
        	return;
        	}
        if (i % 2 == 0) 
        {
            System.out.println(i);
        }
        printEven(i + 1);
    }

    public static void main(String[] args) {
        printEven(1);
    }
}
