package com.core_java_programs;
class M{
    public void test1(){
        System.out.println("test 1 completed ..");
    }
}

class N extends M{
    public void test2(){
        System.out.println("test 2 completed ..");
    }
}

class O extends N{
    public void test3(){
        System.out.println("test 3 completed ...");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        O o = new O();
        o.test1();
        o.test2();
        o.test3();
    }
}

