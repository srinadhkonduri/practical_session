package string_programs_preparation;

import java.util.Scanner;

public class FindTheLongestWordInTheGivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String name = sc.nextLine();
        name += " "; // Add space to capture the last word
        String word = ""; // stores all the words

        String lw = "";             // longest word
        String sw = null;           // shortest word

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                if (!word.isEmpty()) {

                    // longest word ...
                    if (lw.isEmpty() || word.length() > lw.length()) {
                        lw = word;
                    }

                    // shortest word ...
                    if (sw == null || word.length() < sw.length()) {
                        sw = word;
                    }
                }
                word = "";
            }
        }

        System.out.println(lw);
        System.out.println(sw);
    }
}
