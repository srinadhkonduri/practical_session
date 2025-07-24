package string_programs_preparation;

import java.util.Scanner;

public class PrintWordsEndsWithVowel {
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
                        System.out.print(word + " ");
                    }
                    else {
                        System.out.println("not strings with last vowels");
                    }
                }
                else {
                    System.out.println("string is empty");
                }
                word = "";
            }
        }
    }

    public static boolean checkVowel(String str){
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(str.length()-1) == 'a' || str.charAt(str.length()-1) == 'e'
            || str.charAt(str.length()-1) == 'i' || str.charAt(str.length()-1) == 'o' ||
                    str.charAt(str.length()-1) == 'u'){
                return true;
            }
        }
        return false;
    }
}
