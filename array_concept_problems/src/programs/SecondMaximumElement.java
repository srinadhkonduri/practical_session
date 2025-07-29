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
        for (int j : arr) {
            if (isEven(j) && j > mv) {
                mv = j;
            }
        }
        return mv;
    }

    // trace this program
    public static int secondMax(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int j : arr) {
            if (isEven(j)) {
                if (j > first) {
                    second = first;
                    first = j;
                } else if (j > second && j != first) {
                    second = j;
                }
            }
        }

        return second;
    }


    public static boolean isEven(int n){
        return n % 2 == 0;
    }
}
