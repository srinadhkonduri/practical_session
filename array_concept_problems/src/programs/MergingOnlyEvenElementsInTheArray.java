package programs;

import java.util.Scanner;

public class MergingOnlyEvenElementsInTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array 1: ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter : " + i + " ith index value : ");
            arr1[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("Enter the size of the array 2 :");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter : " + i + " ith index element : ");
            arr2[i] = sc.nextInt();
        }

        // merging two arrays with only even elements
        int[] c = new int[arr1.length+arr2.length];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (isEven(arr1[i])){
                c[index] = arr1[i];
                index++;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (isEven(arr2[i])){
                c[index] = arr2[i];
                index++;
            }
        }

        for (int i = 0; i < index; i++) {
            System.out.print(c[i] + " ");
        }
    }

    public static boolean isEven(int n){
        return n % 2 ==0;
    }
}
