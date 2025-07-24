package com.programs;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();

        // converting string to char array
        char[] ch = str.toCharArray();
        boolean[] visited = new boolean[ch.length];

        for (int i = 0; i < ch.length; i++) {
            if (!visited[i]) {
                // assigning a count variable
                int count = 0;
                for (int j = i; j < ch.length; j++) {
                    if (ch[i] == ch[j]) {
                        visited[j] = true;
                        count++;
                    }

                }
                // remove duplicates and print unique elements
                if (count >= 1){
                    System.out.print(ch[i] + " ");
                }
            }
        }
    }

}