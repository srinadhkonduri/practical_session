package two_d_arrays_problem;

import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value : ");
        int n = sc.nextInt();
        int[][] result = pascal(n);
        print(result);
    }

    public static int[][] pascal(int n){
        // jagged array
        int[][] ans = new int[n][];
        for (int i = 0; i < n; i++) {
            // creating one more column for every another line
            ans[i] = new int[i+1];
            ans[i][0] = ans[i][i] = 1; // first and last initialize with 0

            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i-1][j-1] + ans[i-1][j];
            }
        }
        return ans;
    }

    public static void print(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
