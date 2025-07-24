package programs;

import java.util.Scanner;

public class NthSmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter : " + i + " ith index : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the n value : ");
        int n = sc.nextInt();
        int result = nthSmallestNumber(arr,n);

        System.out.println(n + " th smallest number is : " + result);
    }

    public static int nthSmallestNumber(int[] arr, int n){
        // for finding the size you need to iterate through array
        int size = arr.length;
        if (n <= 0 || n > size){
            System.out.println("invalid");
        }

        // bubble sort in descending order
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr[n-1];
    }
}
