package constructor_chaining;

public class Bike extends Vehicle{
    protected String brand;
    protected double price;
    public Bike(String engine, int wheels, int seats, String brand, double price) {
        super(engine, wheels, seats);
        this.brand = brand;
        this.price = price;
    }

    public void displayBike(){
        display();
        System.out.println("brand is : " + brand);
        System.out.println("price is : " + price);
    }
}
