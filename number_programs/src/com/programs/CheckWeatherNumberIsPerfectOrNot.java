package com.programs;

import java.util.Scanner;

public class CheckWeatherNumberIsPerfectOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if (isPerfect(num)){
            System.out.println(num + " is perfect");
        }
        else {
            System.out.println(num + " is not perfect");
        }
    }

    // creating a method for checking a number is perfect or not
    public static boolean isPerfect(int n){
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0){
                sum += i;
            }
        }
        return (n == sum);
    }
}
