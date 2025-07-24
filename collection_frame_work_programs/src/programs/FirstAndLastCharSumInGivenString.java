package programs;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLastCharSumInGivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter no of elements : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }

        // looping all the elements
        for (int i = 0; i < list.size(); i++){
            String str = list.get(i);

            char first = str.charAt(0);
            char last = str.charAt(str.length()-1);

            int sum = (int) first + (int) last;
            System.out.println(first + " (" + (int) first + ")" + " + " + last + "(" + (int) last + ")" + " = " + sum
            );
        }
    }
}
