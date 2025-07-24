package exception_handling.AIOOBE;

import java.util.Scanner;

public class Approach5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int chance = 0;
        System.out.println("Enter the index value : ");
        int index = sc.nextInt();
        while (true){
            try {
                System.out.println(arr[index]);
            } catch (ArrayIndexOutOfBoundsException e){
                if (chance == 3){
                    System.out.println("max limit reached ");
                    break;
                }
                System.out.println("re enter you have only " + (3-chance) + " chances");
                index = sc.nextInt();
                chance++;
            }
        }
    }
}
