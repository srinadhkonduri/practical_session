package has_a_relationship;

public class Legs {
    private int legs;

    public Legs(int legs) {
        this.legs = legs;
    }
    public int getCount(){
        return legs;
    }

    public String toString(){
        return String.valueOf(legs);
    }
}
