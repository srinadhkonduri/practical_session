package string_programs_preparation;

import java.util.Scanner;

public class PrintPalindromesInTheGivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  a String : ");
        String name = sc.nextLine();
        name += " ";
        String word = "";
        String palindromeWords = "";
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch != ' '){
                word += ch;
            }
            else {
                if (!word.isEmpty()){
                    if (isPalindrome(word)){
                        palindromeWords += word + ", ";
                    }
                }
                else {
                    System.out.println("word is empty ..");
                }
                word = "";
            }
        }
        System.out.println(palindromeWords);
    }

    // checking if the given string a palindrome or not
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
