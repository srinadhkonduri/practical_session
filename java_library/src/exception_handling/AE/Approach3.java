package exception_handling.AE;

import java.util.Scanner;

public class Approach3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ask one time
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            System.out.println(a/b);
        } catch (ArithmeticException e){
            // asking second time
            System.out.println("re enter the b value : ");
            b = sc.nextInt();
            try {
                System.out.println(a/b);
            } catch (ArithmeticException e1){
                // asking third time
                System.out.println("re - re - enter the value : ");
                b = sc.nextInt();
                System.out.println(a/b);
            }
        }
    }
}
