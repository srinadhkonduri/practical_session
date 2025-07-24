package programs;

import java.util.Scanner;

public class LargestDuplicateInGivenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr2 = duplicate(arr);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > max){
                max = arr2[i];
            }
        }
        System.out.println("the largest duplicate is : " + max);
    }

    public static int[] duplicate(int[] arr){
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (!visited[i]){
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[i] == arr[j]){
                        visited[j] = true;
                        count++;
                    }
                }
            }
            if (count > 1){
                return new int[]{arr[i]};
            }
        }
        return new int[]{-1};
    }

}
