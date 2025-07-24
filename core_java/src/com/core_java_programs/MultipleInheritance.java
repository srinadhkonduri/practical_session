package com.core_java_programs;
interface C {
    void test();
}
interface D{
    void test1();
}

abstract class E implements C,D{
    @Override
    public void test() {
        System.out.println("test completed");
    }

    @Override
    public void test1() {
        System.out.println("test 1 completed ..");
    }
}
class F extends E{
    public void test3(){
        System.out.println("test 3 competed ..");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        F f = new F();
        f.test();
        f.test1();
        f.test3();
    }
}
