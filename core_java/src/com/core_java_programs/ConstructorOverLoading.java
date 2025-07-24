package com.core_java_programs;

public class ConstructorOverLoading {

    public String name;
    public int age;
    public int sal;

    public ConstructorOverLoading(String name, int age){
        System.out.println("empty constructor over loading...");
        this.name = name;
        this.age = age;
    }

    public ConstructorOverLoading(String name){
        System.out.println("empty constructor over loading...");
        this.name = name;
    }

    public ConstructorOverLoading(String name, int age, int sal) {
        this.name = name;
        this.age = age;
        this.sal = sal;
    }

    public void display(){
        System.out.println("name is :" + name);
        System.out.println("age is :" + age);
        System.out.println("sal is : " + sal);
    }
}
