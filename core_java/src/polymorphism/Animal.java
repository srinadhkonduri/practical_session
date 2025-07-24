package polymorphism;

public class Animal{
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound();
        Dog dog = new Dog();
        dog.sound();
        Lion lion = new Lion();
        lion.sound();
    }

}
