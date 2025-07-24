package recursion_1_2_3_4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Enter a num :");
            int n = sc.nextInt();
            int n1 = fact(n);
            System.out.println(n1);

            System.out.println("Enter 1 to con 0 to stop : ");
            int choice = sc.nextInt();
            if (choice == 0){
                break;
            }
        }
    }

    public static int fact(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        return n * fact(n-1);
    }
}
