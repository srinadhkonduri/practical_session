package has_a_relationship;

public class Main {
    public static void main(String[] args) {
        Legs lionLegs = new Legs(4);
        Lion lion = new Lion(lionLegs);
        lion.display();
    }
}
