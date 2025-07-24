package two_d_arrays_problem_2;

import java.util.Scanner;

public class GenerateNCrossNMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n matrix : ");
        int n = sc.nextInt();
        int[][] result = spiralOrderMatrix(n);
        print2DArray(result);

    }


    public static void print2DArray(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] spiralOrderMatrix(int n){
        int[][] matrix = new int[n][n];
        int topRow = 0, bottomRow = n-1, leftColumn = 0, rightColumn = n-1;
        int curr = 0;
        while (curr < n * n){
            // top row(fixed) -> left-col to right-col
            for (int i = leftColumn; i <= rightColumn && curr <= n * n; i++) {
                matrix[topRow][i] = curr++;
            }
            topRow++;
            // right col -> top row to bottom row
            for (int i = topRow; i <= bottomRow && curr <= n * n; i++) {
                matrix[i][rightColumn] = curr;
                curr++;
            }
            rightColumn--;
            // bottom row -> right col to left col
            for (int i = rightColumn; i >= leftColumn && curr <= n * n; i--) {
                matrix[bottomRow][i] = curr;
                curr++;
            }
            bottomRow--;
            // left col -> bottom row to top row
            for (int i = bottomRow; i >= topRow && curr <= n * n; i--) {
                matrix[i][leftColumn]  = curr;
                curr++;
            }
            leftColumn++;
        }
        return matrix;
    }
}
