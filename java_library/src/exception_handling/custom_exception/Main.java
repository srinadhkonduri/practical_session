package exception_handling.custom_exception;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            throw new CustomException("Division by zero is not allowed");
        }
    }
}
