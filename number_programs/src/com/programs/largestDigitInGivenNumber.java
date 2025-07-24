package com.programs;

import java.util.Scanner;

public class largestDigitInGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num : ");
        int num = sc.nextInt();
        int res = largest(num);
        System.out.println(res);
    }

    public static int largest(int n){
        int largest = Integer.MIN_VALUE;
        while (n != 0){
            int rem = n % 10;
            if (rem > largest){
                largest = rem;
            }
            n /= 10;
        }
        return largest;
    }
}
