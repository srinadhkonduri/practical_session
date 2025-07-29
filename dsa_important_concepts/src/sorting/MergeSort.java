package sorting;
// Divide the array into two halves
// sort the 2 sub arrays using recursion
// merge the two sorted sub-arrays to create an overall sorted arrays

public class MergeSort {

    public static void merge(int[] arr, int l, int mid, int r){
        int n1 = mid - l + 1;
        int n2 = r - mid;

        // creating two arrays
        int[] left = new int[n1];
        int[] right = new int[n2];

        // filling the two arrays with the elements
        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i]; // left to i
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j]; // mid+1 to j
        }

        // creating three index values
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2){
            if (left[i] < right[j]){
                arr[k++] = left[i++];
            }
            else {
                arr[k++] = right[j++];
            }
        }
        while (i < n1) arr[k++] = left[i++];
        while (j < n2) arr[k++] = right[j++];
    }

    public static void mergeSort(int[] arr, int l, int r){
        if (l >= r) return;
        // finding out the mid
        int mid = (l+r) / 2;
        // merge first half
        mergeSort(arr,l,mid); // left - mid
        mergeSort(arr,mid+1,r); //mid + 1 - right
        merge(arr,l,mid,r); // arr - left - mid - right
    }

    public static void printArray(int[] arr){
        for (int v : arr){
            System.out.print(v + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {7,3,8,4,9,1,2};
        int n = arr.length;
        System.out.println("before sorting : ");
        printArray(arr);
        System.out.println();
        mergeSort(arr,0,n-1);
        System.out.println("after sorting : ");
        printArray(arr);
    }
}
