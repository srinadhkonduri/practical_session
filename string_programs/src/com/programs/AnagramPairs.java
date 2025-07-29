package com.programs;

public class AnagramPairs {
    public static void main(String[] args) {
        String input = "listen silent top pot rat tar door";
        // converting the given string into the string array ...
        String[] words = getWords(input);
        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                if (isAnagram(words[i], words[j])){
                    System.out.println("Anagram pair: " + words[i] + " <-> " + words[j]);
                }
            }
        }

    }

    public static boolean isAnagram(String str1, String str2){
        if (str1.length() != str2.length()){
            return false;
        }

        int[] count = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for (int i : count){
            if (i != 0) return false;
        }
        return true;
    }


    public static String[] getWords(String str){
        int wordCount = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') wordCount++;
        }
        String word = "";
        String[] words = new String[wordCount];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' '){
                word += ch;
            }
            else {
                words[index++] = word;
                word = "";
            }
        }
        words[index] = word; // last word
        return words;
    }
}
