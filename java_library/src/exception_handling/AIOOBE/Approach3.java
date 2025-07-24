package exception_handling.AIOOBE;

import java.util.Scanner;

public class Approach3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the index value : ");
        int index = sc.nextInt();

        try {
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("re enter the index value : ");
            index = sc.nextInt();
            try {
                System.out.println(arr[index]);
            } catch (ArrayIndexOutOfBoundsException e1){
                System.out.println("re re enter the index value : ");
                index = sc.nextInt();
                System.out.println(arr[index]);
            }
        }
    }
}
