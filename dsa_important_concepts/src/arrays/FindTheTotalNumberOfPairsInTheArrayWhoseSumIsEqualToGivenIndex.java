package arrays;

import java.util.Scanner;

public class FindTheTotalNumberOfPairsInTheArrayWhoseSumIsEqualToGivenIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int res = sumOfPairs(arr,7);
        System.out.println("sum of pairs are : " + res);

    }

    public static int sumOfPairs(int[] arr, int target){
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] + arr[j] == target){
                    ans++;
                }
            }
        }
        return ans;
    }
}
