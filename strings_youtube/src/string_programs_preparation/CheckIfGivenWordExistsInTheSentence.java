package string_programs_preparation;

import java.util.Scanner;

public class CheckIfGivenWordExistsInTheSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String name = sc.nextLine();
        name += " ";
        String word = "";
        System.out.print("Enter a target word : ");
        String target = sc.nextLine();
        String[] words = new String[100];
        int index = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch != ' '){
                word += ch;
            }
            else {
                if (!word.isEmpty()){
                    words[index++] = word;
                    word = "";
                }
            }
        }

        // finding the given words exist in the sentence or not
        for (int i = 0; i < index; i++) {
            if (!word.isEmpty()){
                if (checkWord(words,target)){
                    System.out.println("yes");
                    break;
                }
            }
            else {
                System.out.println("not present");
                break;
            }
        }
    }

    // creating a method for checking if the word is present or not
    public static boolean checkWord(String[] str, String target){
        for (int i = 0; i < str.length; i++) {
            if (str[i].equalsIgnoreCase(target)){
                return true;
            }
        }
        return false;
    }
}
