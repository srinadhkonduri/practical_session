package arrays;

public class InsertingAnElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,0};
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        insert2DArray(arr1,1,1,19);
        print2DArray(arr1);

    }

    public static void insert(int[] arr, int pos, int ele){
        int size = arr.length;
        for (int i = size - 2; i >= pos; i--) {
            arr[i+1] = arr[i];
        }
        arr[pos] = ele;
    }


    public static void insert2DArray(int[][] arr, int pos1, int pos2, int ele){
        insert(arr[pos1],pos2,ele);
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
