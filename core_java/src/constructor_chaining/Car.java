package constructor_chaining;

public class Car extends Vehicle{
    protected String brand;
    protected double price;
    public Car(String engine, int wheels, int seats, String brand, double price) {
        super(engine, wheels, seats);
        this.brand = brand;
        this.price = price;
    }

    public void displayCar(){
        display();
        System.out.println("brand : " + brand);
        System.out.println("price is : " + price);
    }
}
