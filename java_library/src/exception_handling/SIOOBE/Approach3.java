package exception_handling.SIOOBE;

import java.util.Scanner;

public class Approach3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String name = sc.nextLine();
        int i = sc.nextInt();
        try {
            System.out.println(name.charAt(i));
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("re enter the index value : ");
            i = sc.nextInt();
            try {
                System.out.println(name.charAt(i));
            } catch (StringIndexOutOfBoundsException e1){
                System.out.println("re re enter the index value : ");
                i = sc.nextInt();
                System.out.println(name.charAt(i));
            }
        }
    }
}
