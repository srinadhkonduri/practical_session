package character_programs;

import java.util.Scanner;

public class RemoveDuplicatesFromGivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String name = sc.nextLine();
        removeDuplicates(name);
    }

    public static void removeDuplicates(String str){
        char[] ch = str.toCharArray();
        boolean[]visited = new boolean[ch.length];
        for (int i = 0; i < ch.length; i++) {
            if (!visited[i]){
                int count = 1;
                for (int j = 0; j < ch.length; j++) {
                    if (ch[i] == ch[j]){
                        visited[j] = true;
                        count++;
                    }
                }
                if (count >= 2){
                    System.out.print(ch[i] + " ");
                }
            }
        }
    }
}
