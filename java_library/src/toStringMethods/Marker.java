package toStringMethods;

public class Marker {
    public String brand;
    public String color;
    public double cost;

    public Marker(String brand, String color, double cost) {
        this.brand = brand;
        this.color = color;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Marker{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                '}';
    }
    public void display(){
        System.out.println("brand is : " + brand);
        System.out.println("color : " + color);
        System.out.println("cost is : " + cost);
    }

    public static void main(String[] args) {
        Marker marker1 = new Marker("cello","red",45);
        Marker marker2 = new Marker("doms","blue",67);
        String info1 = marker1.toString();
        System.out.println(info1);
        marker2.display();
    }
}
