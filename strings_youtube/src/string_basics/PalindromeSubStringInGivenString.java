package string_basics;

import java.util.Scanner;

public class PalindromeSubStringInGivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                String subStr = "";
                for (int k = i; k < j; k++) {
                    subStr += s.charAt(k);
                }
                if (isPalindrome(subStr)){
                    System.out.print(subStr + " ");
                    count++;
                }
            }
        }
        System.out.println("\nthe number of palindrome in the given string : " + count);
    }

    public static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length()-1;
        while (i < j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
