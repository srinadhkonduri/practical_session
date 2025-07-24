package com.programs;

import java.util.Scanner;

public class ExponentialValueOfCountOfEachDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int count = count(num);
        while (num != 0){
            int res;
            int rem = num % 10;
            res = exponential(rem,count);
            System.out.println(rem + " x " + count + " = " + res);
            num /= 10;
        }
    }

    // creating a count method
    public static int count(int n){
        int count = 0;
        while (n != 0){
            count++;
            n /= 10;
        }
        return count;
    }

    // creating a method for calculating the exponential value
    public static int exponential(int base, int exp){
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result = result * base;
        }
        return result;
    }
}
