package com.core_java_programs;

public class VehicleValidation {
    public static boolean checkEngine(String engine){
        String[] engineNames = {"v8","v6","v12","v4","v2","v10"};
        for (int i = 0; i < engineNames.length; i++) {
            if (engine.equalsIgnoreCase(engineNames[i])){
                return true;
            }
        }
        return false;
    }

    public static boolean checkWheels(int n){
        return n >= 4;
    }

    public static boolean checkPrice(double price){
        return price >= 2000000;
    }
}
