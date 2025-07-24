package constructor_chaining;

public class MainClass {
    public static void main(String[] args) {
        Car car = new Car("v6",4,4,"bmw",500000);
        Bike bike = new Bike("v8",2,1,"bmw 1250",2800000);
        car.displayCar();
        System.out.println("================");
        bike.displayBike();
    }
}
