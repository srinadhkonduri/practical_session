package recursion_1_2_3_4;

public class Power {
    public static void main(String[] args) {
        System.out.println(pow(5,3));
    }
    static int pow(int base, int exp){
        if (exp == 0) return 1;
        return pow(base,exp-1) * base;
    }
}
