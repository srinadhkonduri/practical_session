package string_basics;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String name = sc.nextLine();
        name += " ";
        String word = "";
        String reverse = "";
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch != ' '){
                word += ch;
            }
            else {
                reverse += reversed(word) + " ";
                word = "";
            }
        }
        System.out.println("reversed word : " + reverse);
    }


    // creating a method for reversing each word in the given string
    public static String reversed(String str){
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            rev = ch + rev;
        }
        return rev;
    }
}
