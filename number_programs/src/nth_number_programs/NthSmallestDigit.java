package nth_number_programs;

import java.util.Scanner;

public class NthSmallestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.print("Enter the n value : ");
        int n = sc.nextInt();
        int result = nthSmallest(num,n);
        System.out.println(n + " th smallest number is : " + result);

    }

    // method for finding the nth smallest number
    public static int nthSmallest(int num , int n){
        int[] freq = new int[10];
        int count = 0;

        // finding the frequency of every number
        while (num != 0){
            int rem = num % 10;
            freq[rem]++;
            num /= 10;
        }

        // traversing the given array in ascending order
        for (int i = 0; i <= 9; i++) {
            if (freq[i] > 0){
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
