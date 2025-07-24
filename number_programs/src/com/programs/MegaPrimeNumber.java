package com.programs;

import java.util.Scanner;

public class MegaPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if (isMegaPrimeNumber(num)){
            System.out.println(num + " is mega prime number");
        }
        else {
            System.out.println(num + " is not mega prime number");
        }
    }
    public static boolean isPrime(int n){
        if (n < 2) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean isMega(int n){
        boolean result = false;
        while (n != 0){
            int rem = n % 10;
            result = isPrime(rem);
            n /= 10;
        }
        return result;
    }

    public static boolean isMegaPrimeNumber(int n){
        return isPrime(n) && isMega(n);
    }
}
