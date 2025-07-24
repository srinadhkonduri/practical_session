package com.programs;

public class TwistedPrimeOrNot {
    public static void main(String[] args) {
       if (isTwistedPrime(13)){
           System.out.println("it is a twisted prime number ..");
       }
       else {
           System.out.println("it is not twisted prime number ..");
       }
    }

    // checking the number is prime or not
    public static boolean isPrime(int n){
        if (n < 2) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    // reversing method
    public static int reverse(int n){
        int rev = 0;
        while (n != 0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        return rev;
    }

    // is twisted prime or not
    public static boolean isTwistedPrime(int n){
        return (isPrime(n) == isPrime(reverse(n)));
    }
}
