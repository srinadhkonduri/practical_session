package constructor_chaining_using_super_calling_statements;

public class Vehicle {
    protected String brand;
    protected String engine;

    public Vehicle(String brand, String engine) {
        this.brand = brand;
        this.engine = engine;
    }

    public void display(){
        System.out.println("brand is : " + brand);
        System.out.println("engine is : " + engine);
    }
}
