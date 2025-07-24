package com.programs;

import java.util.Scanner;

public class SumOfFactorialOfEachDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int sum = 0;
        while (num != 0){
            int rem = num % 10;
            int res = fact(rem);
            sum += res;
            num /= 10;
        }
        System.out.println("sum of factorial is : " + sum);
    }

    // creating a method for factorial
    public static int fact(int n){
        if (n == 0) return 1;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

}
