package patterns;

public class Diamond {
    public static void main(String[] args) {
        int n = 5;
        // upper part
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = i; j < n; j++) {
                System.out.print("   ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            // star
            for (int j = 1; j < i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        // lower part
        for (int i = n-1; i >= 0; i--) {
            // spaces
            for (int j = i; j < n; j++) {
                System.out.print("   ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            // star
            for (int j = 1; j < i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
