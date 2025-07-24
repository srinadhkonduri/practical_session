package arrays;

import java.util.Scanner;

public class CountTheNumberOfTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int res = countTriplets(arr,12);
        System.out.println("no of triplets are : " + res);
    }

    public static int countTriplets(int[] arr, int target){
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}
