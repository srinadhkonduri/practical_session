package string_programs_preparation;

import java.util.Scanner;

public class CountTheFrequencyOfEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String name = sc.nextLine();
        name += " ";

        // added two extra lines
        String[] words = new String[100]; // array to store the extracted words .
        int index = 0; // index to track where to store each word
        //
        String word = ""; // word to build character by character
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

        boolean[] visited = new boolean[index];
        // here iterate the index value...
        for (int i = 0; i < index; i++) {
            if (!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < index; j++) {
                    // check if the stored words are equal or not
                    if (words[i].equals(words[j])) {
                        count++;
                        visited[j] = true;
                    }
                }
                System.out.println(words[i] + " ---> " + count);
            }
        }
    }
}
