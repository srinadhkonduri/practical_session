package arrays;

public class DeletingAnElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        delete2DArray(arr1,1,1);
        delete2DArray(arr1,2,0);
        print2DArray(arr1);

    }
    public static void delete(int[] arr, int pos){
        for (int i = pos; i < arr.length-2; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
    }

    public static void delete2DArray(int[][] arr, int pos1, int pos2){
        delete(arr[pos1],pos2);
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void print2DArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
