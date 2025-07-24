package programs;

import java.util.Scanner;

public class NthPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth number : ");
        int nth = sc.nextInt();
        int res = nthPrime(nth);
        System.out.println(nth + " prime number is : " + res);
        sc.close();
    }

    // checking a number is prime or not
    public static boolean isPrime(int n){
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int nthPrime(int n){
        int count = 0;
        int num = 2;
        while (true){
            if (isPrime(num)){
                count++;
                if (count == n){
                    return num;
                }
            }
            num++;
        }
    }
}
