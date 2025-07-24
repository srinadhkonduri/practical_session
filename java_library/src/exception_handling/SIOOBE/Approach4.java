package exception_handling.SIOOBE;

import java.util.Scanner;

public class Approach4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String name = sc.nextLine();
        System.out.println("enter index value :");
        while (true){
            int index = sc.nextInt();
            try {
                System.out.println(name.charAt(index));
                break;
            } catch (StringIndexOutOfBoundsException e){
                System.out.println("re enter the value : ");
            }
        }
    }
}
