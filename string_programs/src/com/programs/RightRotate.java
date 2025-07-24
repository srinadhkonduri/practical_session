package com.programs;

import java.util.Scanner;

public class RightRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        System.out.print("Enter the number of rotations : ");
        int n = sc.nextInt();
        String res = rightRotate(str,n);
        System.out.println("right rotate : " + res);
    }

    public static String rightRotate(String str, int n){
        char[] ch = str.toCharArray();
        while (n > 0){
            char last = ch[ch.length-1];
            for (int i = ch.length-1; i > 0; i--) {
                ch[i] = ch[i-1];
            }
            ch[0] = last;
            n--;
        }
        String newString = "";
        for (char c : ch){
            newString += c;
        }
        return newString;
    }
}
