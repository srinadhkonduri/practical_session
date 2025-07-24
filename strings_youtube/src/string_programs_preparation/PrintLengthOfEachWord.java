package string_programs_preparation;

import java.util.Scanner;

public class PrintLengthOfEachWord {
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
                    int lengths = length(word);
                    System.out.println(word + " ---> " + lengths + " ");
                }
                word = "";
            }
        }
    }


    // calculating the length of word in the given string
    public static int length(String str){
        return str.length();
    }
}
