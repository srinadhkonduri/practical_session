package exception_handling.custom_exception;

public class Test {

    public static void start() throws InterruptedException{
        for (int i = 1; i <= 5; i++){
            Thread.sleep(500);
            System.out.println(i);
        }
    }

    public static void run() throws InterruptedException{
        start();
    }

    public static void stop() throws InterruptedException{
        run();
    }
    public static void main(String[] args) throws InterruptedException {
        stop();
    }
}
