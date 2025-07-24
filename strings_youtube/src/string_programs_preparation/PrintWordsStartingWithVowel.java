package string_programs_preparation;

import java.util.Scanner;

public class PrintWordsStartingWithVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String name = sc.nextLine();
        name += " ";
        String word = "";
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch != ' '){
                word += ch;
            }
            else {
                if (!word.isEmpty()){
                    if (checkVowel(word)){
                        System.out.println(word + " ");
                    }
                    else {
                        System.out.println("no strings with vowels starting ...");
                    }
                }
                word = "";
            }
        }
    }


    // creating a method for checking if the word containing any vowel
    public static boolean checkVowel(String str){
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(0) == 'a' || str.charAt(0) == 'e' ||
            str.charAt(0) == 'i' || str.charAt(0) == 'o' || str.charAt(0) == 'u'){
                return true;
            }
        }
        return false;
    }
}
