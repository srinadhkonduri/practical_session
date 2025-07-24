package programs;

public class PrintUniqueElements {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,5,5,5,6,6,7,8,9,10,11,11};
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            if (!visited[i]){
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]){
                        visited[j] = true;
                        count++;
                    }
                }
            }
            if (count == 1){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
