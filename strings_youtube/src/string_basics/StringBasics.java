package string_basics;

import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String name = sc.nextLine();
        name += " ";
        String word = "";
        String result = "";
        String longestPlaindrome = "";
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch != ' '){
                word += ch;
            }
            else {
                result += reverse(word) + " ";
                if (isPalindrome(word) && word.length() > longestPlaindrome.length()){
                    longestPlaindrome = word;
                }
                word = "";
            }
        }
        if (!longestPlaindrome.isEmpty()){
            System.out.println("longest palindrome : " + longestPlaindrome);
        }
        else {
            System.out.println("no longest palindrome found ..");
        }
        if (word.equals(reverse(word))){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }

    // creating a method for reversing the string
    public static String reverse(String str){
        String rev = "";
        for (int i = str.length()-1; i >= 0; i--) {
            char ch = str.charAt(i);
            rev = rev + ch;
        }
        return rev;
    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}

/*
S.No	Problem Name	            Description
Reverse each word	                "Java is fun" → "avaJ si nuf"
Print each word on new line	        Extract and print each word separately
Count number of words	            Count how many times else block is hit
Find longest word	                Track the word with max length
Find shortest word	                Track the word with min length
Find longest palindrome word	    Already shared above
Check if all words are palindrome	Print all palindromic words
Capitalize first letter of each word	e.g., "java is fun" → "Java Is Fun"
Convert each word to uppercase/lowercase	.toUpperCase() or .toLowerCase()
Count frequency of each word	Use HashMap<String, Integer> in else
Print duplicate words	HashMap where count > 1
Print words with even/odd length	Check word.length() % 2 == 0
Print words starting with vowel	Check word.charAt(0) for vowel
Remove duplicate words	Use HashSet<String> to track unique
Count total characters (excluding spaces)	Count characters in word
Replace a word in the sentence	If word.equals("Java"), replace with another
Print words in reverse order	Store words in ArrayList, reverse at end
Print word with max vowels	Count vowels in each word
Check for anagrams among words	Compare sorted versions of words
Print words with all unique characters	Check if all characters in word are unique using Set<Character>
* */