package toStringMethods;

public class toStringMethod {
    public String name;
    public int id;
    public double sal;

    public toStringMethod(String name, int id, double sal) {
        this.name = name;
        this.id = id;
        this.sal = sal;
    }

    public void display(){
        System.out.println("name is : " + name);
        System.out.println("id is : " + id);
        System.out.println("sal is : " + sal);
    }

    public static void main(String[] args) {
        toStringMethod toStringMethod1 = new toStringMethod("tony",4,56000);
        toStringMethod1.display();
        String emp = toStringMethod1.toString();
        System.out.println(emp);
        // toStringMethods  => package name
        // .toStringMethod  => class name
        // @27973e9b => address...
    }
}
