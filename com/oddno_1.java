package com;

public class oddno_1 {

    public static void printOdd(int i) {
        if (i < 1) 
        	{
        	return;
        	}
        if (i % 2 == 1) 
        {
            System.out.println(i);
        }
        printOdd(i - 1);
    }

    public static void main(String[] args) {
        printOdd(10);
    }
}
