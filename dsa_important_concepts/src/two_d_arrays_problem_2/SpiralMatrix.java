package two_d_arrays_problem_2;

import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows and columns : ");
        int rows = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[rows][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter : " + "[" + i + "]" + "[" + j + "]" + " elements : ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("given matrix : ");
        print2DArray(arr);

        System.out.println("spiral matrix : ");
        spiralOrderMatrix(arr,rows,col);
    }

    public static void print2DArray(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void spiralOrderMatrix(int[][] matrix, int r, int c){
        int topRow = 0, bottomRow = r-1, leftColumn = 0, rightColumn = c-1;
        int totalElements = 0;
        while (totalElements < r * c){
            // top row(fixed) -> left-col to right-col
            for (int i = leftColumn; i <= rightColumn && totalElements < r * c; i++) {
                System.out.print(matrix[topRow][i] + " ");
                totalElements++;
            }
            topRow++;
            // right col -> top row to bottom row
            for (int i = topRow; i <= bottomRow && totalElements < r * c; i++) {
                System.out.print(matrix[i][rightColumn] + " ");
                totalElements++;
            }
            rightColumn--;
            // bottom row -> right col to left col
            for (int i = rightColumn; i >= leftColumn && totalElements < r * c; i--) {
                System.out.print(matrix[bottomRow][i] + " ");
                totalElements++;
            }
            bottomRow--;
            // left col -> bottom row to top row
            for (int i = bottomRow; i >= topRow && totalElements < r * c; i--) {
                System.out.print(matrix[i][leftColumn] + " ");
                totalElements++;
            }
            leftColumn++;
        }
    }
}
