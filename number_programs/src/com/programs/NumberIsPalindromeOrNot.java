package com.programs;

import java.util.Scanner;

public class NumberIsPalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if (isPalindrome(num)){
            System.out.println(num + " is palindrome");
        }
        else {
            System.out.println(num + " is not palindrome");
        }
    }

    // creating a method for reversing a number
    public static int reverse(int n){
        int rev = 0;
        while (n != 0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        return rev;
    }

    // creating a method for checking the number is palindrome or not
    public static boolean isPalindrome(int n){
        return (n == reverse(n));
    }
}
