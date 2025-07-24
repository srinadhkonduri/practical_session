package exception_handling.AIOOBE;

import java.util.Scanner;

public class Approach4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the index value :");
        while (true){
            int index = sc.nextInt();
            try {
                System.out.println(arr[index]);
                break;
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("re enter the index value : ");
            }
        }

    }
}
