package com.programs;

import java.util.Scanner;

public class CountPrimeNumbersInGivenDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num : ");
        int num = sc.nextInt();
        int count = 0;
        while (num != 0){
            int rem = num % 10;
            if (isPrime(rem)){
                count++;
            }
            num /= 10;
        }
        System.out.println("the number of prime digits are : " + count);
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


}
