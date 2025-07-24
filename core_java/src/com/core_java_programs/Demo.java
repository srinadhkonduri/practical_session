package com.core_java_programs;

public class Demo {
    public static void main(String[] args) {
        ConstructorOverLoading constructorOverLoading =
                new ConstructorOverLoading("Tony",34,50000);
        ConstructorOverLoading constructorOverLoading1 =
                new ConstructorOverLoading("captain",45);
        ConstructorOverLoading constructorOverLoading2 =
                new ConstructorOverLoading("hulk");
        constructorOverLoading.display();
        System.out.println("=========================");
        constructorOverLoading1.display();
        System.out.println("=========================");
        constructorOverLoading2.display();
    }
}
