package com.programs;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String name = sc.nextLine();
        String res = rev(name);
        System.out.println("reversed string is : " +res);
    }
    // creating a method for reversing the string
    public static String reverse(String str){
        String rev = "";
        for (int i = str.length()-1; i >= 0; i--) {
            char ch = str.charAt(i);
            rev = rev + ch;
        }
        return rev;
    }

    public static String rev(String str){
        String rev ="";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            rev = ch + rev;
        }
        return rev;
    }
}
