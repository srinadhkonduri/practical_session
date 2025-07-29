package sorting;
// TC => best case : O(n log n)
// Tc => worst case : O(n ^ 2)
// SC => O(n log n) due to recursion track
public class QuickSort {

    public static int partition(int[] arr, int l, int r){
        int pivot = arr[r]; // last element as the pivot
        int i = l - 1; // pointer for smaller element

        // looping from left to right ...
        for (int j = l; j < r; j++) {
            // if element is less than pivot then swap
            if (arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place the pivot in the correct position
        int temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;

        return i + 1; // return the partition index
    }

    public static void quickSort(int[] arr, int l, int r){
        if (l <= r){
            int pi = partition(arr,l,r);
            quickSort(arr,l,pi-1);
            quickSort(arr,pi+1,r);
        }
    }

    public static void printArray(int[] arr){
        for (int v : arr){
            System.out.print(v + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {7,2,1,6,8,5,3,4};
        System.out.println("before sorting : ");
        printArray(arr);
        quickSort(arr,0,arr.length-1);
        System.out.println();
        System.out.println("after sorting : ");
        printArray(arr);
    }
}
