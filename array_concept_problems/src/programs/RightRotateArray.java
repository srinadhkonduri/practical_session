package programs;

public class RightRotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("before rotating : ");
        printArray(arr);
        System.out.println();
        System.out.println("after rotating ");
        rightRotate(arr,2);
        printArray(arr);
        System.out.println("left rotate : ");
        leftRotate(arr,2);
        printArray(arr);
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void rightRotate(int[] arr, int n){
        while (n > 0){
            int last = arr[arr.length-1];
            // take 1 here
            for (int i = arr.length-1; i > 0; i--) {
                // most important line
                arr[i] = arr[i-1];
            }
            arr[0] = last;
            n--;
        }
    }

    public static void leftRotate(int[] arr, int n){
        while (n > 0){
            int first = arr[0];
            for (int i = 0; i < arr.length-1; i++) {
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = first;
            n--;
        }
    }
}
