package programs;

import java.util.Scanner;

public class SumOfAllPrimeNumberInTheGivenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter : "+ i + " element : ");
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])){
                sum += arr[i];
            }
        }
        System.out.println("the sum of prime numbers in the given array : " + sum);
    }

    public static boolean isPrime(int n){
        if (n < 2) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
