package string_programs_preparation;

import java.util.Scanner;

public class CheckIfAllWordsAreUniqueOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String name = sc.nextLine();
        name += " ";
        String word = "";
        String[] words = new String[100]; // assume max 100 words
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

        // checking if the words are equal or not
        boolean[] visited = new boolean[index];
        for (int i = 0; i < index; i++) {
            int count = 0;
            if (!visited[i]){
                for (int j = 0; j < index; j++) {
                    if (words[i].equals(words[j])){
                        visited[j] = true;
                        count++;
                    }
                }
            }
            if (count == 1){
                System.out.println("the given string is unique..");
            }
            else {
                System.out.println("the given string is not unique ..");
            }
            break;
        }
    }

}
