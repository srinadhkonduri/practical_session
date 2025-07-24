package exception_handling.AE;

import java.util.Scanner;

public class Approach4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (true){
            try {
                System.out.println(a/b);
                break;
            } catch (ArithmeticException e){
                System.out.println("re enter the b value : ");
                b = sc.nextInt();
            }
        }
    }
}
