package arrays;

public class FirstRepeatingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,3};
        int res = repeatingNumber(arr);
        System.out.println(res);
    }
    public static int repeatingNumber(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
