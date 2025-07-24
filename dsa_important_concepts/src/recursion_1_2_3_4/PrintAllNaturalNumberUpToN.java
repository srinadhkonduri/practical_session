package recursion_1_2_3_4;

import java.util.Scanner;

public class PrintAllNaturalNumberUpToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num :");
        int n = sc.nextInt();
        print(n);
        System.out.println();
        printDecreasing(n);
    }

    public static void print(int n){
        if (n == 1){
            System.out.print(1 + " ");
            return;
        }

        // recursive work
        print(n - 1);

        // self work
        System.out.print(n + " ");
    }

    public static void printDecreasing(int n){
        if (n == 1){
            System.out.print(1 + " ");
            return;
        }

        // self work
        System.out.print(n + " ");

        // recursive work
        printDecreasing(n - 1);

    }
}
