package constructor_chaining_using_super_calling_statements;

public class Bike extends Vehicle{

    private double price;
    private int wheels;

    public Bike(String brand, String engine, double price, int wheels) {
        super(brand, engine);
        this.price = price;
        this.wheels = wheels;
    }

    public void show(){
        display();
        System.out.println("price : " + price);
        System.out.println("wheels : " + wheels);
    }
}
