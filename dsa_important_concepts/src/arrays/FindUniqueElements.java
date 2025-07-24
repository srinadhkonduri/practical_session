package arrays;

public class FindUniqueElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,2,1};
        int res = findUnique(arr);
        System.out.println("unique elements : " + res);
    }
    public static int findUnique(int[] arr){
        // 1. traverse all pairs
        // 2. equal pair mark as -1
        // 3. traverse array again
        // 4. value > 0 is our final answer
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0){
                ans = arr[i];
            }
        }
        return ans;
    }
}
