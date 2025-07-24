package com.programs;

import java.util.Scanner;

public class SumOf9s____ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Enter a number : ");
            int n = sc.nextInt();
            System.out.print("enter a value of series : ");
            int series = sc.nextInt();
            int value = series;
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += value;
                System.out.println(value);
                value = (value*10)+series;
            }
            System.out.println("sum of 9s is : " + sum);


            System.out.println("enter 0 to stop or 1 to continue : ");
            int choice = sc.nextInt();
            if (choice == 0){
                System.out.println("thank you ...");
                break;
            }
        }

    }
}
