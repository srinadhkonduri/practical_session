package com.programs;

import java.util.Scanner;

public class GivenNumberIsStrongNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if (isStrong(num)){
            System.out.println(num + " is strong number ");
        }
        else {
            System.out.println(num + " is not strong number");
        }
    }

    // creating a method for calculating the fact of the given number
    public static int fact(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // checking the given number is strong number or not
    public static boolean isStrong(int n){
        int sum = 0;
        int temp = n;
        while (n != 0){
            int rem = n % 10;
            sum = sum + fact(rem);
            n /= 10;
        }
        return (temp == sum);
    }
}
