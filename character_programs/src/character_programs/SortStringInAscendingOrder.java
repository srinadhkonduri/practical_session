package character_programs;

import java.util.Scanner;

public class SortStringInAscendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String name = sc.nextLine();
        char[] ch = name.toCharArray();
        ascendingOrder(ch);
        print(ch);
        descendingOrder(ch);
        System.out.println();
        print(ch);
    }

    public static void ascendingOrder(char[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = (char) temp;
                }
            }
        }
    }

    public static void descendingOrder(char[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = (char) temp;
                }
            }
        }
    }

    public static void print(char[] ch){
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ' '){
                System.out.print(ch[i] + " ");
            }
        }
    }

}
