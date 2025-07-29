package com.programs;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String name = sc.nextLine();
        for (int i = 0; i < name.length(); i++) {
            StringBuilder sub = new StringBuilder();
            for (int j = i; j < name.length(); j++) {
                sub.append(name.charAt(j));
                System.out.print(sub + " ");
            }
        }
    }
}
