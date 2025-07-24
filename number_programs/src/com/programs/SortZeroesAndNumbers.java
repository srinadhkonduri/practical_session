package com.programs;

public class SortZeroesAndNumbers {
    public static void main(String[] args) {
        int[] arr = {0,12,0,34,0,56};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sort(int[] arr){
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                swap(arr,i,j);
                j++;
            }
        }
    }
    public static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
