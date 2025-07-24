package character_programs;

import java.util.Scanner;

public class OccurrenceOfEachCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String name = sc.nextLine();
        char[] ch = name.toCharArray();
        boolean[] visited = new boolean[ch.length];
        for (int i = 0; i < ch.length; i++) {
            int count = 1;
            if (!visited[i]){
                for (int j = i+1; j < ch.length; j++) {
                    if (ch[i] == ch[j]){
                        visited[j] = true;
                        count++;
                    }
                }
                System.out.println(ch[i] + " ---> " + count);
            }

        }
    }
}
