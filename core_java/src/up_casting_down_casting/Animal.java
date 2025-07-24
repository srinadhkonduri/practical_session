package up_casting_down_casting;
class Ani {
    public void sound(){
        System.out.println("makes sounds ..");
    }
}
class Dog extends Ani{
    public void bark(){
        System.out.println("bow bow ... 🐕");
    }
}
public class Animal {
    public static void main(String[] args) {
        Ani a = new Dog(); // up-casting ...
        a.sound();
        Dog d = (Dog) a; // down-casting ...
        d.bark();
    }
}
