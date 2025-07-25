package has_a_relationship.composition;

import java.io.Serializable;

public class Car implements Serializable {
    private String brand;
    private String color;
    private double price;
    private int wheels;

    public Engine e;

    public Car () {}

    public Car(String brand, String color, double price, int wheels, Engine e) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.wheels = wheels;
        this.e = e;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void carDetails(){
        System.out.println("brand : " + getBrand());
        System.out.println("color : " + getColor());
        System.out.println("price : " + getPrice());
        System.out.println("wheels : " + getWheels());
        if (e != null){
            e.display();
        }
        else {
            System.out.println();
        }
    }

}
