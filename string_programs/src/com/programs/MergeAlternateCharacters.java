package com.programs;

public class MergeAlternateCharacters {
    public static void main(String[] args) {
        String str1 = "tony";
        String str2 = "captain";
        String res = mergeAlternate(str1,str2);
        System.out.println(res);
    }

    public static String mergeAlternate(String word1, String word2){
        int i = 0;
        int j = 0;
        int m = word1.length();
        int n = word2.length();

        StringBuilder res = new StringBuilder();
        while (i < m && j < n){
            res.append(word1.charAt(i++));
            res.append(word2.charAt(j++));
        }
        while (i < m){
            res.append(word1.charAt(i++));
        }
        while (j < n){
            res.append(word2.charAt(j++));
        }
        return res.toString();
    }
}
