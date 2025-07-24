package com.programs;

import java.util.Scanner;

public class LeftRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        System.out.print("Enter the number of rotations : ");
        int n = sc.nextInt();
        String res = leftRotate(str,n);
        System.out.println("left rotate : " + res);
    }

    public static String leftRotate(String str, int n){
        char[] ch = str.toCharArray();
        while (n > 0){
            char first = ch[0];
            for (int i = 0; i < ch.length-1; i++) {
                // important line
                ch[i] = ch[i+1];
            }
            ch[ch.length-1] = first;
            n--;
        }
        String newString = "";
        for (char c : ch){
            newString += c;
        }
        return newString;
    }
}
