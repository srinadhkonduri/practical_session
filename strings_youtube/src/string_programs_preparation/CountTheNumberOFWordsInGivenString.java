package string_programs_preparation;

import java.util.Scanner;

public class CountTheNumberOFWordsInGivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String name = sc.nextLine();
        name += " ";
        String word = "";
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch != ' '){
                word += ch;
            }
            else {
                // every time it finds a word in increments the count...
                count++;
                word = "";
            }
        }
        System.out.println("the no of words in the given string : " + count);
    }
}
