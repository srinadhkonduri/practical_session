package arrays;

import java.util.Arrays;

public class TargetSumProblem {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7};
        int[] res = targetSum(arr,9);
        System.out.println(Arrays.toString(res));
    }
    public static int[] targetSum(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
