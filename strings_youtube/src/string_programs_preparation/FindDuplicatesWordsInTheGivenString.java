package string_programs_preparation;

import java.util.Scanner;

public class FindDuplicatesWordsInTheGivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String name = sc.nextLine();
        name += " ";
        String word = "";
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


        // finding the duplicates words in the given string ...
        boolean[] visited = new boolean[index];
        for (int i = 0; i < index; i++) {
            int count = 0;
            if (!visited[i]){
                for (int j = i+1; j < index; j++) {
                    if (words[i].equals(words[j])){
                        visited[j] = true;
                        count++;
                    }
                }
            }

            // for finding duplicates count should be >= 1
            if (count >= 1){
                System.out.print(words[i] + " ");
            }
        }
    }
}
