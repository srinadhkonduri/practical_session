package com.programs;

import java.util.Scanner;

public class AddingFirstAndLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int result = add(num);
        System.out.println("adding first and last digit : " + result);
    }

    // logic
    public static int add(int n) {
        // single digit number....
        if (n >= 0 && n <= 9){
            return n * 2;
        }
        int lastDigit = n % 10; // 9084 % 10 => 4
        int firstDigit = n; // fd = 9084
        while (firstDigit >= 10){ // 9084 >= 10
            firstDigit /= 10; // 9084 /= 10 => 908
            // 908 /= 10 => 90
            // 90 /= 10 => 9
            // 9 >= 10 condition false exits from loop stored fd as 9
        }
        return firstDigit+lastDigit; // 9 + 4 => 13
    }
}
