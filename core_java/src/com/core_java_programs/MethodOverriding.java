package com.core_java_programs;

class A {
    public void test(){
        System.out.println("run 1 km ....");
    }
}

class B extends A {
    @Override
    public void test(){
        System.out.println("run 5 km ...");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        B b = new B();
        b.test();
    }
}
