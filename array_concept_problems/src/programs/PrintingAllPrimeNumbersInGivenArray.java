package programs;

import java.util.Scanner;

public class PrintingAllPrimeNumbersInGivenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + i + " index element : ");
            arr[i] = sc.nextInt();
        }

        // printing all the prime number in the given array
        System.out.println("prime numbers in the array are : ");
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])){
                System.out.print(arr[i] + " ");
            }
        }
    }

    // creating a method to check if the given number is prime or not
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
