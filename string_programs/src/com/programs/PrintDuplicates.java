package com.programs;

import java.util.Scanner;

public class PrintDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();

        // converting string to char array
        char[] ch = str.toCharArray();
        boolean[] visited = new boolean[ch.length];

        // assigning a count variable

        for (int i = 0; i < ch.length; i++) {
            if (!visited[i]) {
                // should start from i+1
                int count = 1;
                for (int j = i+1; j < ch.length; j++) {
                    if (ch[i] == ch[j]) {
                        visited[j] = true;
                        count++;
                    }

                }

                if (count > 1){
                    System.out.print(ch[i] + " ");
                }
            }
        }
    }
}
