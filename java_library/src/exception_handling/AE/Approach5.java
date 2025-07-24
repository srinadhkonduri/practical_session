package exception_handling.AE;

import java.util.Scanner;

public class Approach5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int chance = 0;
        while (true) {
            try {
                System.out.println(a/b);
                break;
            }
            catch (ArithmeticException e){
                if (chance == 3){
                    System.out.println("you reached maximum limits ");
                    break;
                }
                System.out.println("re enter value you have only " + (3-chance) + " chances ...");
                b = sc.nextInt();
                chance++;
            }
        }
    }
}
