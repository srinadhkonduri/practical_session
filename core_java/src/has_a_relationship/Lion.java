package has_a_relationship;

public class Lion{
    private Legs legs;

    public Lion(Legs legs) {
        this.legs = legs;
    }
    public void display(){
        System.out.println("lion legs : "+ legs);
    }
}
