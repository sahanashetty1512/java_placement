package com;
import java.util.Scanner;

public class palindrome_string_1 {
    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a string");
        String org = sc1.nextLine();

        String reverse = reverse(org);

        if (org.equals(reverse)) {
            System.out.println(org + " is palindrome");
        } else {
            System.out.println(org + " is not palindrome");
        }
    }
}
