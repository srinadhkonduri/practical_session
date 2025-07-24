package nth_number_programs;

import java.util.Scanner;

public class NthLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter which palindrome you want : ");
        int nth = sc.nextInt();
        int result = nthPalindrome(nth);
        System.out.println(nth +  " th palindrome is : " + result);
    }

    // reversing method
    public static int reverse(int n){
        int rev = 0;
        while (n != 0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        return rev;
    }

    // checking is palindrome or not
    public static boolean isPalindrome(int n){
        return (n == reverse(n));
    }

    // checking for nth palindrome
    public static int nthPalindrome(int n){
        int num = 1;
        int count = 0;
        while (true){
            if (isPalindrome(num)){
                count++;
                if (count == n){
                    return num;
                }
            }
            num++;
        }
    }
}
