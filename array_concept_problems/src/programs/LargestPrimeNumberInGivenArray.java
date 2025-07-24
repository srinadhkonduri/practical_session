package programs;

import java.util.Scanner;

public class LargestPrimeNumberInGivenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter :" + i + " ith index value :");
            arr[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])){
                if (arr[i] > largest){
                    largest = arr[i];
                }
            }
        }
        System.out.println("the largest prime number is : " + largest);
    }

    // creating a method for checking if a number is prime or not
    public static boolean isPrime(int n){
        if (n < 2) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
