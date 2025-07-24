package polymorphism;

abstract public class Ani{
    abstract public void sound();
}

class Dog extends Ani{
    public void sound(){
        System.out.println("dog barks ... bow bow 🐕");
    }
}

class Cat extends Ani{

    @Override
    public void sound() {
        System.out.println("cat meows ... meow meow 🐈");
    }
}

class Lion extends Ani {

    @Override
    public void sound() {
        System.out.println("Lion roars ... roar 🦁");
    }
}


