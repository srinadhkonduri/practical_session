package programs;

import java.util.Scanner;

public class LargestEvenNumberPresentInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter " + i + " th index : ");
            arr[i] = sc.nextInt();
        }

        // creating a new array and storing the elements in the array
        // if the elements are only even
        int[] b = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            int j = arr[i];
            if (isEven(j)) {
                b[index] = j;
                index++;
            }
        }

        // printing the largest value in the integer
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < b.length; i++) {
            if (b[i] > largest) {
                largest = b[i];
            }
        }
        System.out.println("the largest even element in the array : " + largest);

    }
    // creating a method for checking if number is even or not
    public static boolean isEven(int n){
        return n % 2 == 0;
    }

}
