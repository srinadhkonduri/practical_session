package nth_number_programs;

import java.util.Scanner;
public class NthLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num : ");
        int num = sc.nextInt();
        System.out.print("Enter n value : ");
        int n = sc.nextInt();
        int res = nthLargest(num, n);
        if (res != -1) {
            System.out.println(n + " th largest digit is : " + res);
        } else {
            System.out.println("Invalid input. Not enough digits.");
        }
    }

    public static int nthLargest(int num , int n){
        int[] freq = new int[10];
        int count = 0;

        // counting the freq of each digit
        while (num != 0){
            int rem = num % 10;
            freq[rem]++;
            num /= 10;
        }

        // traverse form 9 to 0 to get digits in descending order
        for (int i = 9; i >= 0; i--) {
            while (freq[i] > 0){
                count++;
                freq[i]--;
                if (count == n){
                    return i;
                }
            }
        }
        return -1;
    }


}
