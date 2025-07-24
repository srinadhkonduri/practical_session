package programs;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestAndSmallestElementsInTheCollection {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a element number : ");
        int n = sc.nextInt();

        System.out.println("Enter" + n + " elements ..");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            int ele = (Integer) list.get(i);
            if (ele > max){
                max = ele;
            }
            if (ele < min){
                min = ele;
            }
        }
        System.out.println("max value is : " + max);
        System.out.println("min value is : " + min);

    }
}
