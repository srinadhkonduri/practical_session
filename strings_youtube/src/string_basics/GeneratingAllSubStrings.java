package string_basics;

import java.util.Scanner;

public class GeneratingAllSubStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String name = sc.nextLine();
        for (int i = 0; i < name.length(); i++) {
            String sub = "";
            for (int j = i; j < name.length(); j++) {
                sub += name.charAt(j);
                System.out.print(sub + " ");
            }
        }
    }
}
