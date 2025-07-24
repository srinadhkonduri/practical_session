package com.programs;

import java.util.Scanner;

public class NumberOfStepsToReduceNumberToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Enter a Number : ");
            int num = sc.nextInt();
            int res = reduceNumber(num);
            System.out.println(res);

            System.out.println("Enter 0 to stop 1 to continue : ");
            int choice = sc.nextInt();
            if (choice == 0){
                System.out.println("thank you for using our application ...");
                break;
            }
        }
    }

    public static int reduceNumber(int num){
        int steps = 0;
        while (num != 0){
            if (num % 2 == 0){
                num /= 2;
            }
            else {
                num -= 1;
            }
            steps++;
        }
        return steps;
    }
}
