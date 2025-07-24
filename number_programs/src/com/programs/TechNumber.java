package com.programs;

import java.util.Scanner;

public class TechNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num : ");
        int num = sc.nextInt();
        if (checkEvenOrNot(countOfDigits(num))){
            int temp1 = num;
            int ltd = num % 100; //
            while (temp1 > 100){
                temp1 /= 10;
            }
            int result = ltd + temp1;
            int finalResult = isSquare(result);
            if (num == finalResult){
                System.out.println("tech number ..");
            }
            else {
                System.out.println("not tech number ..");
            }
        }
        else {
            System.out.println("the given count of digits are not even" +
                    " please enter even count of digits ...");
        }
    }

    // creating method to count the number of digits
    public static int countOfDigits(int n){
        int count = 0;
        while (n != 0){
            count++;
            n /= 10;
        }
        return count;
    }

    // checking the count of digits are even or not
    public static boolean checkEvenOrNot(int n){
        return n % 2 == 0;
    }

    public static int isSquare(int n){
        return n * n;
    }
}
