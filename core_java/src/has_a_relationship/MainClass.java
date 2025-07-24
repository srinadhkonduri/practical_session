package has_a_relationship;

public class MainClass {
    public static void main(String[] args) {
        Engine engine = new Engine("V8");
        Car car = new Car("Mustang", engine);

        car.startCar();
        car.showDetails();
    }
}
