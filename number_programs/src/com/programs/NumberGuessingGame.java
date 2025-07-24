package com.programs;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int randNumber = rand.nextInt(10) + 1;
        int chance = 10;
        System.out.println("Welcome to number guessing game : ");
        System.out.println("guess the number between 1 to 10 : ");
        while (chance > 0){
            System.out.println("enter your guess : ");
            int playerGuess = sc.nextInt();
            if (playerGuess == randNumber) {
                System.out.println("🎉 Correct! You win!");
                break;
            } else if (playerGuess < randNumber) {
                System.out.println("Too low...");
            } else {
                System.out.println("Too high...");
            }
            chance--;
            if (chance > 0) {
                System.out.println("You have " + chance + " chance(s) left.\n");
            } else {
                System.out.println("❌ Game over! The correct number was: " + randNumber);
            }
        }
        sc.close();
    }
}
