package com.programs;

import java.util.Scanner;

public class RepeatedMoreThanTwice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String :");
        String name = sc.nextLine();
        duplicate(name);
    }

    public static void duplicate(String name){
        char[] ch = name.toCharArray();
        boolean[] visited = new boolean[ch.length];
        for (int i = 0; i < ch.length; i++) {
            int count = 0;
            if (!visited[i]){
                for (int j = i; j < ch.length; j++) {
                    if (ch[i] == ch[j]){
                        visited[j] = true;
                        count++;
                    }
                }
            }
            if (count > 2){
                System.out.print(ch[i] + " ");
            }
        }
    }
}
