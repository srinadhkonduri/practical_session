package com.programs;

import java.util.Scanner;

public class LongestPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String name = sc.nextLine();
        name += " ";
        String word = "";

        String longestPalindrome = "";

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch != ' '){
                word += ch;
            }
            else {
                if (isPalindrome(word)){
                    if (word.length() > longestPalindrome.length()){
                            longestPalindrome = word;
                    }
                }
                word = "";
            }
        }
        System.out.println("the longest palindrome is : " + longestPalindrome);
    }

    // checking if the string is palindrome or not
    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while (left < right){
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
