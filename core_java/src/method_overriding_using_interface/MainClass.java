package method_overriding_using_interface;
interface Details {
    void showDetails();
}
class A implements Details {
    @Override
    public void showDetails(){
        System.out.println("details from class A");
    }
}
class B extends A {
    public void showDetails(){
        System.out.println("details from class B");
    }
}
class C extends A {
    public void showDetails(){
        System.out.println("details from class C");
    }
}
public class MainClass {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        C objC = new C();

        objA.showDetails();
        objB.showDetails();
        objC.showDetails();
    }
}
