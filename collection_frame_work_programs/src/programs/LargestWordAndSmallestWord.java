package programs;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestWordAndSmallestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.print("Enter the no of ele : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }

        String largest = list.get(0);
        String smallest = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            String st = list.get(i);
            if (st.length() > largest.length()){
                largest = st;
            }
            if (st.length() < smallest.length()){
                smallest = st;
            }
        }
        System.out.println("largest word is : " + largest);
        System.out.println("smallest word is : " + smallest);
    }
}
