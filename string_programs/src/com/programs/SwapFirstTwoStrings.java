package com.programs;

import java.util.Scanner;

public class SwapFirstTwoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String name = sc.nextLine();
        name += " ";
        String word = "";
        String[] words = new String[30]; // max 30 words assume;
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

        // swapping first two words
        if (index >= 2){
            String temp = words[0];
            words[0] = words[1];
            words[1] = temp;
        }
        for (int i = 0; i < index; i++) {
            System.out.print(words[i] + " ");
        }
    }

}
