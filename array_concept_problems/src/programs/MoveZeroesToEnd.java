package programs;



public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0,0};
        System.out.print("before  : ");
        printArray(arr);
        System.out.print("after : ");
        sortZeroes(arr);
        printArray(arr);
    }

    public static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void sortZeroes(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while (left < right){
            if (arr[left] == 0 && arr[right] == 1){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left] == 1){
                left++;
            }
            if (arr[right] == 0){
                right--;
            }
        }
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
