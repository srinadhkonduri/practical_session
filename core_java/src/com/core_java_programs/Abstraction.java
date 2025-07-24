package com.core_java_programs;

import java.util.Scanner;

public class Abstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the engine type : ");
        String eng = sc.nextLine();
        System.out.println("Enter the no of wheels : ");
        int wheels = sc.nextInt();
        System.out.println("Enter the price : ");
        int price = sc.nextInt();
        Vehicle vehicle = new Vehicle(eng,wheels,price);
        vehicle.display();
    }
}
