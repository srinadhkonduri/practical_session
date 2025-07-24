package constructor_chaining;

public class Vehicle {
    protected String engine;
    protected int wheels;
    protected int seats;

    public Vehicle(String engine, int wheels, int seats) {
        this.engine = engine;
        this.wheels = wheels;
        this.seats = seats;
    }

    public void display(){
        System.out.println("engine : " + engine);
        System.out.println("wheels : " + wheels);
        System.out.println("seats : " + seats);
    }
}
