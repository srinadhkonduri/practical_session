package programs;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,10,11,15,12,3,8,7};
        int[] arr2 = {6,5,2,9,4,19,13,17};
        ascendingOrder(arr1);
        ascendingOrder(arr2);
        int[] arr3 = new int[arr1.length+arr2.length];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr3[index] = arr1[i];
            index++;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[index] = arr2[i];
            index++;
        }
        System.out.print("before sorting : ");
        printArray(arr3);
        ascendingOrder(arr3);
        System.out.println();
        System.out.print("After sorting : ");
        printArray(arr3);

    }


    public static void ascendingOrder(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
