package array_list;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseElements {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);
        array.add(50);
        System.out.println("original list : " + array);
//        reverseList(array);
        Collections.reverse(array);
        System.out.println("reversed : " + array);

        ArrayList<String> ss = new ArrayList<>();
        ss.add("Welcome");
        ss.add("to");
        ss.add("my laptop");
        Collections.sort(ss, Collections.reverseOrder());
        System.out.println(ss);
    }


    public static void reverseList(ArrayList<Integer> list){
        int i = 0, j = list.size()-1;
        while (i < j){
            Integer temp = list.get(i);
            list.set(i,list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }


}
