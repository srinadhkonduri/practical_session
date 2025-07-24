package com.programs;

import java.util.Scanner;

public class ReversingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int res = reverse(num);
        System.out.println("reversed number is : " + res);
    }
    // creating a method for reversing the number
    public static int reverse(int n){
        int rev = 0;
        while (n != 0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        return rev;
    }
}
