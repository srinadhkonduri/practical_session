package com.programs;

import java.util.Scanner;

public class ReverseWordsInGivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String name = sc.nextLine();
        name += " ";
        String word = "";
        String[] words = new String[100];
        int index = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch != ' '){
                word += ch;
            }
            else {
                words[index++] = word;
                word = "";
            }
        }


        // reverse the words string
        for (int i = index-1; i >= 0; i--) {
            System.out.print(words[i] +  " ");
        }
    }

}
