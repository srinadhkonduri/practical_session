package programs;

import java.util.ArrayList;


public class PrintElementsInAscendingOrder {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(45);
        list.add(23);
        list.add(56);
        list.add(78);
        list.add(12);
        list.add(90);

        sort(list);
        for (int value : list){
            System.out.print(value +  " ");
        }

    }

    public static void sort(ArrayList<Integer> arr){
        for (int i = 0; i < arr.size()-1; i++) {
            for (int j = 0; j < arr.size()-i-1; j++) {
                if (arr.get(j) > arr.get(j+1)){
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, temp);
                }
            }
        }
    }

}
