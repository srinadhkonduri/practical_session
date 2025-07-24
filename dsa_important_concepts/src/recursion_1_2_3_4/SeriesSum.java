package recursion_1_2_3_4;

public class SeriesSum {
    public static void main(String[] args) {
        System.out.println(seriesSum(10));
    }
    static int seriesSum(int n){
        if (n == 0) return 0;
        if (n % 2 == 0){
            return seriesSum(n-1) - n;
        }
        else {
            return seriesSum(n-1) + n;
        }
    }
}
