package arrays;


import java.util.Scanner;

public class InsertingOnlyUniqueElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length;) {
            System.out.print("Enter ele : " + (i) + " : ");
            int num = sc.nextInt();

            if (!isUnique(arr,i,num)){
                arr[i] = num;
                i++;
            }
            else {
                System.out.println("duplicate ! re enter the value : ");
            }
        }

        for (int i : arr){
            System.out.print(i + " ");
        }
    }

    // checking if element is unique or not
    public static boolean isUnique(int[] arr, int length, int target){
        for (int i = 0; i < length; i++) {
            if (arr[i] == target){
                return true;
            }
        }
        return false;
    }

}
