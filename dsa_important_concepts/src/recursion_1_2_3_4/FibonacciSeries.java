package recursion_1_2_3_4;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num : ");
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }


    public static int fibonacci(int n){
        if (n == 0 || n == 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
