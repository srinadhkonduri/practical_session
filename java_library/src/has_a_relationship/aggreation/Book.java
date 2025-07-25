package has_a_relationship.aggreation;

import java.io.Serializable;

public class Book implements Serializable {
    private String brand;
    private int price;
    private int pages;

    public Book () {}

    public Book(String brand, int price, int pages) {
        this.brand = brand;
        this.price = price;
        this.pages = pages;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void display(){
        System.out.println("brand is : " + getBrand());
        System.out.println("price is : " + getPrice());
        System.out.println("pages is : " + getPages());
    }
}
