package programs;

import java.util.Scanner;

public class FirstRepeatedElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("first repeated element ....");
        int result = firstRepeated(arr);
        System.out.println(result);
        System.out.println("most repeated ...");
        int result1 = mostRepeated(arr);
        System.out.println(result1);
    }
    public static int firstRepeated(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static int mostRepeated(int[] arr) {
        int maxCount = 0;
        int mostRepeated = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // important lines...
            if (count > maxCount) {
                maxCount = count;
                mostRepeated = arr[i];
            }
        }
        return mostRepeated;
    }
}
