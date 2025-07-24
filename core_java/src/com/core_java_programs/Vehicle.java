package com.core_java_programs;

public class Vehicle {
    private String engine;
    private int wheels;
    private double price;

    public Vehicle(String engine, int wheels, double price) {
        if (VehicleValidation.checkEngine(engine)){
            this.engine = engine;
        }
        else {
            System.out.println("invalid engine");
        }
        if (VehicleValidation.checkWheels(wheels)){
            this.wheels = wheels;
        }
        else {
            System.out.println("invalid wheels");
        }
        if (VehicleValidation.checkPrice(price)){
            this.price = price;
        }
        else {
            System.out.println("invalid price given ...");
        }
    }

    public void display(){
        System.out.println("engine name : " + engine);
        System.out.println("wheels :" + wheels);
        System.out.println("price : " + price);
    }
}
