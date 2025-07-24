package programs;

public class SecondMaximumElement {
    public static void main(String[] args) {
        int[] arr = {12,14,15,45,67,98};
        int firstmax = firstMax(arr);
        System.out.println(firstmax);
        int secondValue = secondMax(arr);
        System.out.println(secondValue);
    }

    public static int firstMax(int[] arr){
        int mv = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (isEven(arr[i]) && arr[i] > mv){
                mv = arr[i];
            }
        }
        return mv;
    }

    // trace this program
    public static int secondMax(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (isEven(arr[i])) {
                if (arr[i] > first) {
                    second = first;
                    first = arr[i];
                } else if (arr[i] > second && arr[i] != first) {
                    second = arr[i];
                }
            }
        }

        return second;
    }

    public static boolean isEven(int n){
        return n % 2 == 0;
    }
}
