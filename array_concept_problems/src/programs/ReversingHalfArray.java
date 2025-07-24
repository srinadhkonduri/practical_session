package programs;

import java.util.Scanner;

public class ReversingHalfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // half array without reversing
        for (int i = 0; i < arr.length/2; i++) {
            System.out.print(arr[i] + " ");
        }
        int[] b = new int[arr.length];
        for (int i = 0; i < b.length; i++) {
            b[i] = arr[i];
        }
        reverse(b,0,arr.length-1);
        for (int i = 0; i < arr.length/2; i++) {
            System.out.print(b[i] + " ");
        }
    }

    public static void reverse(int[] arr, int left, int right){
        left = 0;
        right = arr.length-1;
        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
