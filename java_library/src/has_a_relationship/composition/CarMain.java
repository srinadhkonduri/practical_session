package has_a_relationship.composition;

public class CarMain {
    public static void main(String[] args) {
        Car c1 = new Car("audi","red",9000000,4,null);
        Car c = new Car("bmw","white",12000000,4,new Engine("30d",1000,650));
        c.carDetails();
        System.out.println("====================");
        c1.carDetails();
    }
}
