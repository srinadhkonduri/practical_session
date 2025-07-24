package has_a_relationship;

public class Car {
    private String model;
    private Engine engine; // has a relation-ship (composition)

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public void startCar(){
        System.out.println(model + " is starting  ...");
        engine.start();
    }

    public void showDetails(){
        System.out.println("car model is : "+ model);
        System.out.println("Engine type : " + engine.getType());
    }
}
