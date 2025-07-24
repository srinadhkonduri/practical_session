package string_programs_preparation;

import java.util.Scanner;

public class ReverseEachWordIndividually {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string :");
        String name = sc.nextLine();
        name += " ";
        String word = "";

        // create a new string and store all the reversed string into the new string ..
        String reversed = "";
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch != ' '){
                word += ch;
            }
            else {
                reversed += reverse(word) + " ";
                word = "";
            }
        }
        System.out.print(reversed + " ");
    }

    // reverse the string
    public static String reverse(String str){
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            rev = ch + rev;
        }
        return rev;
    }
}
