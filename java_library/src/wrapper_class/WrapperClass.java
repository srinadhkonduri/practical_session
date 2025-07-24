package wrapper_class;

import java.util.Scanner;

public class WrapperClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isPalindrome(new Scanner(System.in).nextInt()));
        System.out.println("enter a num : ");
        int num = sc.nextInt();
        String res = reverse(num);
        System.out.println(res);
    }

    public static String isPalindrome(int num){
        String res = num + " is not palindrome";
        String value = new StringBuffer(Integer.toString(num)).reverse().toString();
        if (Integer.parseInt(value) == num){
            res = num + " is palindrome";
        }
        return res;
    }


    public static String reverse(int num){
        return new StringBuffer(Integer.toString(num)).reverse().toString();
    }
}
