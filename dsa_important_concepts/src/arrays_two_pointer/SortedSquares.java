package arrays_two_pointer;

public class SortedSquares {
    public static void main(String[] args) {
        int[] arr = {-10, -5, 2, 6, 7};
        sortSquares(arr);
    }

    static void sortSquares(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1, k = 0;
        int[] ans = new int[n];

        while (left <= right) {
            // Compare absolute values to get larger square
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }

        // Reverse the ans array to get increasing order
        reverse(ans);
        printArray(ans); // <-- FIX: Print sorted squares, not original array
    }

    // Reverse array using Bubble Sort logic in descending order
    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Print array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
