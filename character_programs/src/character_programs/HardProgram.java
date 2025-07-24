package character_programs;

import java.util.Scanner;

public class HardProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i += 2) {
            int count = s.charAt(i) - '0'; // convert digit character to number
            char ch = s.charAt(i+1); // get the character after digit
            for (int j = 0; j < count; j++) {
                System.out.print(ch); // print the character count times
            }
        }
    }


    // tracing for the following program
}
