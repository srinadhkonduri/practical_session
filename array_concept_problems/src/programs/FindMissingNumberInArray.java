package programs;

public class FindMissingNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        int n = arr.length+1;
        int exp_sum = n * (n + 1) / 2;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("missing number : " + (exp_sum-sum));
    }
}
