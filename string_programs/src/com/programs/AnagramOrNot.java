package com.programs;

import java.util.Scanner;

public class AnagramOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1 :");
        String str1 = sc.nextLine();
        System.out.print("Enter String 2 :");
        String str2 = sc.nextLine();
        if (isAnagram(str1,str2)){
            System.out.println("given strings are anagram");
        }
        else {
            System.out.println("given strings are not anagram");
        }
    }

    // checking the strings are anagram or not
    public static boolean isAnagram(String str1, String str2){
        if (str1.length() != str2.length()){
            return false;
        }

        int[] count = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }

        for(int i : count){
            if (i != 0) return false;
        }
        return true;
    }
}
