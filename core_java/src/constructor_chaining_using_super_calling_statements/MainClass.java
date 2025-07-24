package constructor_chaining_using_super_calling_statements;

public class MainClass {
    public static void main(String[] args) {
        Car car = new Car("bmw","30d",7000000,4);
        car.show();
        System.out.println("==========================");
        Bike bike = new Bike("bmw1250gsi","1000cc",2800000,2);
        bike.show();
    }
}
