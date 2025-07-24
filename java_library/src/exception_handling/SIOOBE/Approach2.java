package exception_handling.SIOOBE;

import java.util.Scanner;

public class Approach2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String name = sc.nextLine();
        int i = sc.nextInt();
        try {
            System.out.println(name.charAt(i));
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("done");
        }
    }
}
