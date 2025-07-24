package com.core_java_programs;
class Human {
    public void body(){
        System.out.println("human have eyes");
    }
}

class Men extends Human{

    @Override
    public void body(){
        System.out.println("men have short hair");
    }
}

class Women extends Human {
    @Override
    public void body() {
        System.out.println("women have long hair..");
    }
}
public class MethodOverRidding2 {
    public static void main(String[] args) {
        new Men().body();
        new Women().body();
    }
}
