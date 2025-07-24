package arrays_two_pointer;

public class SortZeroesAndOnes {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1,0,1,0,1,0,1};
        printArray(arr);
        System.out.println();
        System.out.println("sorted array :" );
        sortZeroesAndOnes(arr);
        printArray(arr);
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // sorting 0's and 1's
    public static void sortZeroes(int[] arr){
        int zeroes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                zeroes++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i < zeroes){
                arr[i] = 0;
            }
            else {
                arr[i] = 1;
            }
        }
    }

    // sorting zero's and one's using two pointer approach
    // 1's are sorted in the last...
    public static void sortZeroesAndOnes(int[] arr){
        int left = 0;
        int right  = arr.length-1;
        while (left < right){
            if (arr[left] == 1 && arr[right] == 0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if (arr[left] == 0){
                left++;
            }
            if (arr[right] == 1){
                right--;
            }
        }
    }
}
