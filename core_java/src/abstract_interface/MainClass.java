package abstract_interface;
interface A{
    void test();
}

class C extends B implements A{

    @Override
    public void test() {
        System.out.println("test completed ...");
    }

    @Override
    public void test1() {
        System.out.println("test 1 completed ....");
    }
}
public class MainClass {
    public static void main(String[] args) {
        C c = new C();
        c.test();
        c.test1();
    }
}
