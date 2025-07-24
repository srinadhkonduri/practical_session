package string_programs_preparation;

import java.util.Scanner;

public class StringTemplate {
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
                System.out.println(word);
                word = "";
            }
        }
    }
}
