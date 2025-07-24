package string_basics;

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String name = sc.nextLine();
        name += " ";
        String word = "";

        // program starts ...
        String lw = "";
        String sw = null;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch != ' '){
                word += ch;
            }
            else {
                if (word.length() > lw.length()){
                    lw = word;
                }
                // smallest word can also be nothing
                if (sw == null || word.length() < sw.length()){
                    sw = word;
                }
                word = "";
            }
        }
        System.out.println("longest word : " + lw);
        System.out.println("smallest word : " + sw);
    }
}
