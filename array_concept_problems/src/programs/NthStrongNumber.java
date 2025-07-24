package programs;

import java.util.Scanner;

public class NthStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int nth = sc.nextInt();
        int result = nthStrongNumber(nth);
        System.out.println(nth + " th strong number is : " + result);

        for (int i = 1; i <= 1000; i++) {
            if (isStrong(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static int fact(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isStrong(int n){
        int sum = 0;
        int temp = n;
        while (n != 0){
            int rem = n % 10;
            sum = sum + fact(rem);
            n /= 10;
        }
        return (temp == sum);
    }

    public static int nthStrongNumber(int n){
        int count = 0;
        int num = 1;
        while (true){
            if (isStrong(num)){
                count++;
                if (count == n){
                    return num;
                }
            }
            num++;
        }
    }
}
