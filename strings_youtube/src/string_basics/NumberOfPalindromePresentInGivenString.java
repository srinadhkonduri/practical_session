package string_basics;

import java.util.Scanner;

public class NumberOfPalindromePresentInGivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String name = sc.nextLine();
        name += " ";
        String word = "";

        // program starts ...
        // longest palindrome assign with empty string
        String longestPalindrome = "";
        // shortest palindrome assign with null value
        String shortestPalindrome = null;
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch != ' '){
                word += ch;
            }
            else {
                if (!word.equals("") && isPalindrome(word)){
                    count++;
//                    if (word.length() > longestPalindrome.length()){
//                        longestPalindrome = word;
//                    }
//                    if (shortestPalindrome == null || word.length() < shortestPalindrome.length()){
//                        shortestPalindrome = word;
//                    }
                }
                word = "";
            }
        }
        System.out.println("the palindrome strings : " + count);
//        if (count > 0){
//            System.out.println("longest palindrome : " + longestPalindrome);
//            System.out.println("shortest palindrome : " + shortestPalindrome);
//        }
//        else {
//            System.out.println("no palindrome found ...");
//        }
    }

    public static boolean isPalindrome(String str){
        int start = 0;
        int end = str.length()-1;
        while (start < end){
            if (str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
