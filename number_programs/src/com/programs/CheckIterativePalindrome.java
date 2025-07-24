package com.programs;

import java.util.Scanner;

public class CheckIterativePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Enter a num : ");
            int n = sc.nextInt();

            int result = reverse(n);
            int sum = n + result;
            int count = 1;

            while (true) {

                int reversed = reverse(sum);
                if (sum == reversed) {
                    System.out.println("Palindrome found after " + count + " iteration(s): " + sum);
                    break;
                } else {
                    sum += reversed;
                    count++;
                }
            }

            System.out.println("Enter 1 to continue 0 to stop ");
            int choice = sc.nextInt();
            if (choice == 0){
                break;
            }
        }
    }

    public static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        return rev;
    }
}
