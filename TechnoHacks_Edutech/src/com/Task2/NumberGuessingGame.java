package com.Task2;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lowerlimit = 1;
        int upperlimit = 100;
        int randomNumber = random.nextInt(upperlimit - lowerlimit + 1) + lowerlimit;
        int userGuess = 0;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        while (userGuess != randomNumber) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
            } else if (userGuess > randomNumber) {
                System.out.println("Your guess is too high. Try again.");
            } else {
                System.out.println("Your guess is too low. Try again.");
            }
        }
        scanner.close();
    }
}