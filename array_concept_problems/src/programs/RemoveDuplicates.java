package programs;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,5,6,7,7,8};
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            if (!visited[i]){
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[i] == arr[j]){
                        visited[j] = true;
                        count++;
                    }
                }
            }

            // print duplicates
            if (count > 1){
                System.out.print(arr[i] + " ");
            }


            // remove duplicates
            if (count >= 1){
                System.out.print(arr[i] + " ");
            }
        }
    }

}
