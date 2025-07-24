package exception_handling.SIOOBE;

import java.util.Scanner;

public class Approach1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String name = sc.nextLine();
        int i = sc.nextInt();
        System.out.println(name.charAt(i));
    }
}
