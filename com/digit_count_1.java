package com;

public class digit_count_1 {

    public static int countDigits(int n) {
        if (n == 0) return 0;
        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        int n = 123;
        int count = countDigits(n);
        System.out.println("digit count is " + count);
    }
}
