package two_d_arrays_problem;

import java.util.Scanner;

public class RotateMatrix90DegClockWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows and columns: ");
        int rows = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[rows][col];

        // Input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("before rotating ..");
        print2DArray(arr);
        System.out.println("after rotating ..");
        rotate(arr,rows);
        print2DArray(arr);
    }


    // creating a method for printing the transpose of the matrix
    public static void transpose(int[][] arr, int r, int c){
        for (int i = 0; i < r; i++) {
            for (int j = i; j < c; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }


    public static void print2DArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void rotate(int[][] matrix , int n){
        // transpose
        // reverse each row
        transpose(matrix,n,n);
        for (int i = 0; i < n; i++) {
            reverse(matrix[i]);
        }
    }

    // reverse the array
    public static void reverse(int[] arr){
        int i = 0, j = arr.length-1;
        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
