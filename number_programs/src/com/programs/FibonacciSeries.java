package com.programs;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = sc.nextInt();
        fibonacci(n);
    }

    public static void fibonacci(int n){
        int a = 0;
        int b = 1;
        for (int i = 0; i <= n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
