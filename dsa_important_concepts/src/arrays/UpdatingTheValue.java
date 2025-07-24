package arrays;

public class UpdatingTheValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        update(arr,3,99);
        printArray(arr);
        update2DArray(arr1,1,1,99);
        print2DArray(arr1);
    }
    public static void update(int[] arr, int pos, int ele){
        int size = arr.length;
        if (pos < 0 || pos > size-1){
            System.out.println("wrong position ..");
            return;
        }
        arr[pos] = ele;
    }

    public static void update2DArray(int[][] arr, int pos1, int pos2, int ele){
        int size1 = arr.length;
        if (pos1 < 0 || pos1 > size1 - 1){
            return;
        }

        int size = arr.length;
        if (pos2 < 0 || pos2 > size - 1){
            return;
        }

        arr[pos1][pos2] = ele;
    }




    public static void print2DArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
