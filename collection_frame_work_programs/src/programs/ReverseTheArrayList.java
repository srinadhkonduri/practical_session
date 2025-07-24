package programs;

import java.util.ArrayList;

import java.util.Scanner;

public class ReverseTheArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a element number : ");
        int n = sc.nextInt();

        System.out.println("Enter" + n + " elements ..");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }


        System.out.println("Reverse the list : ");
        for (int i = list.size(); i > 0; i--) {
            System.out.print(i +  " ");
        }

    }
}
