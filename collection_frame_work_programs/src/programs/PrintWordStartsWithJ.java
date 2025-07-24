package programs;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintWordStartsWithJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.print("Enter the no of ele : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }

        // accessing the elements
        //int count = 0;
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (str.startsWith("j")){
                System.out.println(str);
            }
        }
    }
}
