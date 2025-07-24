package test_case_programs;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }


    // swap function
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // partition function
    public static int partition(int[] arr, int low, int high){
        // choose the pivot
        int pivot = arr[high];

        // Index of smaller element and indicates
        // the right position of pivot found so far
        int i = low - 1;

        // traverse form low to high and swap the low elements
        for (int j = low; j <= high; j++) {
            if (arr[j] < pivot){
                i++;
                swap(arr,i,j);
            }
        }

        // Move pivot after smaller elements and
        // return its position

        swap(arr,i+1,high);
        return i + 1;
    }


    public static void quickSort(int[] arr, int low, int high){
        if (low < high){
            int pi = partition(arr,low,high);

            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }
}
