package arrays;

public class FindSecondLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int res = secondLargest(arr);
        System.out.println(res);
    }

    // finding the second - largest element in the array
    // 1. find max
    // 2. mark all max to - infinity
    // 3. find max again this second largest is the output
    public static int findMax(int[] arr){
        int mv = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mv){
                mv = arr[i];
            }
        }
        return mv;
    }

    public static int secondLargest(int[] arr){
        int mv = findMax(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == mv){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        return findMax(arr);
    }

}
