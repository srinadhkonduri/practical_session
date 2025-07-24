package com.core_java_programs;

public class MethodOverloading {
    public static void main(String[] args) {
        String res1 = sum(10,10);
        System.out.println(res1);

        double res2 = sum(10,10.56666);
        System.out.println(res2);

        long res3 = sum(12L,34L);
        System.out.println(res3);
        MethodOverloading methodOverloading = new MethodOverloading();
        int result = methodOverloading.sum(12,13,15);
        System.out.println(result);
    }

    public int sum(int a, int b, int c){
        return a+b+c;
    }

    public static String sum(int a, int b){
        return "result is " + (a+b);
    }

    public static double sum(int a, double b){
        return a+b;
    }

    public static long sum(long a, long b){
        return a+b;
    }

}
