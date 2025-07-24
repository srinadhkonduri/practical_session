package two_d_arrays_problem;

import java.util.Scanner;

public class TransposeOfMatrix {
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

        System.out.println("transpose of the matrix ...");
        transpose(arr,rows,col);
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


    public static int[][] findtranspose(int[][] arr, int r, int c){
        int[][] transpose = new int[r][c];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                transpose[i][j] = arr[j][i];
            }
        }
        return transpose;
    }



}
