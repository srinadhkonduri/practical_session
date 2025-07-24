package programs;

import java.util.ArrayList;
import java.util.Objects;

public class DuplicateElementsInCollection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("tom");
        list.add("jerry");
        list.add("tom");
        list.add("rukando");
        list.add("rujin");
        list.add("jerry");

        boolean[] visited = new boolean[list.size()];
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            int count = 0;
            if (!visited[i]){
                for (int j = 0; j < list.size(); j++) {
                    String str2 = list.get(j);
                    if (Objects.equals(str, str2)){
                        visited[j] = true;
                        count++;
                    }
                }
            }
            if (count > 1){
                System.out.println(str + " ");
            }
        }
    }
}
