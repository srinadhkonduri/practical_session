package has_a_relationship;

public class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public void start(){
        System.out.println(type + " engine started ...");
    }

    public String getType(){
        return type;
    }
}
