package com.programs;

import java.util.Scanner;

public class ToggleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        String res = toggle(str);
        System.out.println(res);
    }


    // toggle string
    public static String toggle(String str){
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                // uppercase to lowercase
                res += (char)(ch + 32);
            } else if (ch >= 'a' && ch <= 'z') {
                // lowercase to uppercase
                res += (char)(ch - 32);
            } else {
                // non-alphabetic characters remain unchanged
                res += ch;
            }
        }
        return res;
    }
}
