package programs;

import java.util.Scanner;

public class SortOnlyEvenElementsInDescendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                // check arr[i] elements is even and also arr[j] elements
                // is even and sort arr[i] < arr[j] in descending order
                if (isEven(arr[i]) && isEven(arr[j]) && arr[i] < arr[j]) {
                    // Swap only even elements
                    swap(arr,i,j);
                }
            }
        }
        printArray(arr);
    }


    public static boolean isEven(int n){
        return n % 2 == 0;
    }

    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    // creating method for swap
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
