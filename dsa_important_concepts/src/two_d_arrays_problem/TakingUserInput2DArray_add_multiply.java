package two_d_arrays_problem;

import java.util.Scanner;

public class TakingUserInput2DArray_add_multiply {
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

        System.out.print("Enter rows and cols of arr2 : ");
        int rows2 = sc.nextInt();
        int col2 = sc.nextInt();
        int[][] arr2 = new int[rows2][col2];
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                arr2[i][j] = sc.nextInt();
            }
        }

        add(arr,rows,col,arr2,rows2,col2);
        System.out.println();
        multiply(arr,rows,col,arr2,rows2,col2);
    }


    public static void add(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2){
        if (r1 != r2 || c1 != c2){
            System.out.println("addition not possible ...");
            return;
        }

        int[][] sum = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        print2DArray(sum);
    }

    // multiplication of two arrays
    public static void multiply(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2){
        if (c1 != r2){
            System.out.println("multiplication not possible ..");
            return;
        }
        int[][] mul = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += (arr1[i][k] * arr2[k][j]);
                }
            }
        }
        print2DArray(mul);
    }

    public static void print2DArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
