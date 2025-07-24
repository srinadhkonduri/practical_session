package com.programs;

import java.util.Scanner;

public class GivenNumIsArmStrongOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if (isArmStrong(num)){
            System.out.println(num + " is armstrong ..");
        }
        else {
            System.out.println(num + " is not armstrong ...");
        }
    }

    // creating a method for counting the number
    public static int count(int n){
        int count = 0;
        while (n != 0){
            count++;
            n /= 10;
        }
        return count;
    }

    // creating a method for finding the exponential
    public static int power(int base, int exp){
        int res = 1;
        for (int i = 1; i <= exp; i++) {
            res = res * base;
        }
        return res;
    }

    // checking the given num is armstrong or not
    public static boolean isArmStrong(int n){
        int count = count(n);
        int temp = n;
        int sum = 0;
        while (n != 0){
            int rem = n % 10;
            sum = sum + power(rem,count);
            n /= 10;
        }
        return (temp == sum);
    }
}
