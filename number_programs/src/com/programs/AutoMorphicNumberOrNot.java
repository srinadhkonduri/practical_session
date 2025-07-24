package com.programs;

import java.util.Scanner;

public class AutoMorphicNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if (isAuto(num)){
            System.out.println(num + " is auto morphic number ...");
        }
        else {
            System.out.println(num + " is not auto morphic number");
        }

        for (int i = 0; i < 10000; i++) {
            if (isAuto(i)){
                System.out.print(i + " ");
            }
        }

        int nth = nthAuto(5);
        System.out.println(nth);
    }

    public static boolean isAuto(int n){
        int square = n * n;
        int temp = n;
        while (temp > 0){
            if ((temp % 10 ) != (square % 10)){
                return false;
            }
            temp /= 10;
            square /= 10;
        }
        return true;
    }

    // nth auto morphic number
    public static int nthAuto(int n){
        int num = 0;
        int count = 0;
        while (true){
            if (isAuto(num)){
                count++;
                if (count == n){
                    return num;
                }
            }
            num++;
        }
    }
}
