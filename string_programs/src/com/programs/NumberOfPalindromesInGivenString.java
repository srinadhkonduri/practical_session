package com.programs;

import java.util.Scanner;

public class NumberOfPalindromesInGivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String name = sc.nextLine();
        name += " ";
        String word = "";
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch != ' '){
                word += ch;
            }
            else {
                if (!word.isEmpty()){
                    if (isPalindrome(word)){
                        count++;
                        System.out.println("the number of palindromes in the given string are : " + count);
                    }
                    else {
                        System.out.println("no palindromes in the given string...");
                        break;
                    }
                }
                else {
                    System.out.println("string is empty");
                }
                word = "";
            }
        }
        System.out.println();

    }

    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while (left < right){
            if (str.charAt(left) !=  str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
