package com.programs;

import java.util.Scanner;

// input => java@123
// output => java@321
public class ReverseOnlyTheGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String :");
        String str = sc.nextLine();
        String result = reverseOnlyDigits(str);
        System.out.println(result);
    }

    public static String reverse(String str){
        String res = "";
        for (int i = str.length()-1; i >= 0; i--) {
            char ch = str.charAt(i);
            res = res + ch;
        }
        return res;
    }

    public static String reverseOnlyDigits(String str){
        char[] ch = str.toCharArray();
        String digits = "";

        // 1. extract digits
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= '0' && ch[i] <= '9'){
                digits = digits + ch[i];
            }
        }

        // 2. reverse the extract digits
        digits = reverse(digits);

        // 3. rebuild the final string
        String result = "";
        int digitIndex = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= '0' && ch[i] <= '9'){
                result = result + digits.charAt(digitIndex++);
            }
            else {
                // if it is not digit then store the string ...
                result = result + ch[i];
            }
        }
        return result;
    }
}
