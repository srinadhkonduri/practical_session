package character_programs;

import java.util.Scanner;

public class NonRepeatedCharactersInGivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String name = sc.nextLine();
        unique(name);
    }

    public static void unique(String str){
        char[] ch = str.toCharArray();
        boolean[] visited = new boolean[ch.length];
        for (int i = 0; i < ch.length; i++) {
            if (!visited[i]){
                int count = 0;
                for (int j = 0; j < ch.length; j++) {
                    if (ch[i] == ch[j]){
                        visited[j] = true;
                        count++;
                    }
                }
                if (count == 1){
                    System.out.print(ch[i] + " ");
                }
            }
        }
    }
}
