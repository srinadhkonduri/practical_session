package nth_number_programs;

import java.util.Scanner;

public class NthArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter which armstrong number you want : ");
        int nth = sc.nextInt();
        int result = nthArmStrongNumber(nth);
        System.out.println(nth + " th armstrong number is : " + result);
    }

    // checking the count of the given digits
    public static int count(int n){
        int count = 0;
        while (n != 0){
            count++;
            n /= 10;
        }
        return count;
    }

    // method for performing the exponential value of the given number
    public static int power(int base , int exp){
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result = result * base;
        }
        return result;
    }

    // checking the number is armstrong or not
    public static boolean isArmStrong(int n){
        int count = count(n);
        int sum = 0;
        int temp = n;
        while (n != 0){
            int rem = n % 10;
            sum = sum + power(rem,count);
            n /= 10;
        }
        return (sum == temp);
    }

    // method for printing nth armstrong number
    public static int nthArmStrongNumber(int n){
        int num = 1;

        // count should be always zero...
        int count = 0;
        while (true){
            if (isArmStrong(num)){
                count++;
                if (count == n){
                    return num;
                }
            }
            num++;
        }
    }
}
