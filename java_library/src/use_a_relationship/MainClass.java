package use_a_relationship;

class Car {
    public void start(){
        System.out.println("car is starting ...");
    }
}


class Driver extends Car{
    public void driver(){
        Car car = new Car();
        car.start();
        System.out.println("Driver driving a car");
    }
}


public class MainClass {
    public static void main(String[] args) {
        Driver a = new Driver();
        a.driver();
    }
}
