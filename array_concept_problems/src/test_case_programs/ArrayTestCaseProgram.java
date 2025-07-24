package test_case_programs;

import java.util.Scanner;

public class ArrayTestCaseProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int result = functionality(arr);
        System.out.println("total sum of even indices are : " + result);
    }
    public static int functionality(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0){
                if (i != 0){
                    sum += arr[i];
                }
            }
            else if (arr[i] == 0){
                System.out.println("array contains zero elements ..");
                break;
            }
            else if (arr[i] < 0){
                System.out.println("array contains -ve elements ..");
                break;
            }
        }
        return sum;
    }
}
