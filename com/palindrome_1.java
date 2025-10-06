package com;
import java.util.Scanner;
public class palindrome_1 {
    public static int reverse(int num, int rev)
    {
        if (num == 0) 
        {
            return rev;
        }
        return reverse(num / 10, rev * 10 + num % 10);
    }
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a number");
        int originalno = sc1.nextInt();
        int reversed = reverse(originalno, 0);
        if (originalno == reversed) {
            System.out.println(originalno + " is palindrome");
        } else {
            System.out.println(originalno + " is not palindrome");
        }
    }
}
