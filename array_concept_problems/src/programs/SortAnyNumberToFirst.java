package programs;

public class SortAnyNumberToFirst {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4};
        System.out.println("before : ");
        printArray(arr);
        System.out.println("after : ");
        System.out.println();
        sortAnything(arr);
        printArray(arr);
    }

    public static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void sortAnything(int[] arr){
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                swap(arr,i,j);
                j++;
            }
        }
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
