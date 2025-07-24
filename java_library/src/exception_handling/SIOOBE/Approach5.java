package exception_handling.SIOOBE;

import java.util.Scanner;

public class Approach5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string  :");
        String name = sc.nextLine();

        int i = sc.nextInt();
        int chance = 0;
        while (true){
            try {
                System.out.println(name.charAt(i));
            } catch (StringIndexOutOfBoundsException e){
                if (chance == 3){
                    System.out.println("max limits ...");
                    break;
                }
                System.out.println("re enter you have only " + (3-chance) + " chnaces");
                i = sc.nextInt();
                chance++;
            }
        }


        // integer to string
        int num = 123;
        String str = String.valueOf(num);
        String rev = "";
        for (int j = str.length()-1; j >= 0; j--) {
            rev += str.charAt(j);
        }
        System.out.println(rev);

        // string to integer
        String str2 = "123";
        int num1 = Integer.parseInt(str2);
        System.out.println(num1);

    }
}
