package com.programs;

import java.util.Scanner;

public class ReverseTheLastWordInTheGivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String name = sc.nextLine();
        name += " ";
        String word = "";

        // creating a new string for storing all the words
        String[] words = new String[30]; // assume 30 words max
        int index = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch != ' '){
                word += ch;
            }
            else {
                if (!word.isEmpty()){
                    words[index++] = word;
                    word = "";
                }
            }
        }

        // Print all words except the last one
        // for printing the last words just change the index - values ...
        for (int i = 0; i < index - 1; i++) {
            System.out.print(words[i] + " ");
        }
        if (index > 0){
            String last = reverse(words[index-1]);
            System.out.print(last);
        }

    }

    // creating a reverse method
    public static String reverse(String str){
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            rev = ch + rev;
        }
        return rev;
    }
}
