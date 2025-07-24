package exception_handling.AE;

import java.util.Scanner;

public class Approach2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        System.out.println("Enter another number : ");
        int b = sc.nextInt();
        try {
            System.out.println(a/b);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
