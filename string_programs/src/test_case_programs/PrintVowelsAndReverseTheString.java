package test_case_programs;

import java.util.Scanner;

// DAY - 7

public class PrintVowelsAndReverseTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String name = sc.nextLine();
        name += " ";  // Add space to ensure last word gets processed

        String word = "";

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (ch != ' ') {
                word += ch;
            } else {
                if (word.isEmpty()) {
                    System.out.println("String is empty...");
                } else {
                    if (word.length() > 4) {
                        System.out.print(printVowels(word) + " ");
                    } else {
                        System.out.print(reverse(word) + " ");
                    }
                    word = ""; // reset for next word
                }
            }
        }
    }

    public static String printVowels(String str) {
        String vowels = "";
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            // Check if character is a vowel
            if ("aeiouAEIOU".indexOf(ch[i]) != -1) {
                vowels += ch[i];
            }
        }
        return vowels;
    }

    public static String reverse(String str) {
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            rev = ch + rev;
        }
        return rev;
    }
}
