package recursion_1_2_3_4;

public class PrintMultiplesOfK {
    public static void main(String[] args) {
        printK(5,4);
    }
    public static void printK(int n, int k){
        // base case
        if (k == 1){
            System.out.println(n);
            return;
        }
        // recursive work
        printK(n,k-1);
        // self work
        System.out.println(n * k);
    }
}
