package com.Task3;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};

        System.out.println("Welcome to Rock, Paper, Scissors Game !");
        System.out.print("Enter your choice (rock, paper, or scissors): ");
        String userChoice = scanner.nextLine().toLowerCase();

        int computerIndex = random.nextInt(3);
        String computerChoice = choices[computerIndex];

        System.out.println("Computer chose: " + computerChoice);
        System.out.println("You chose: " + userChoice);

        String result = determineWinner(userChoice, computerChoice);
        System.out.println("Result: " + result);
    }

    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "It's a tie!";
        } else if (
            (userChoice.equals("rock") && computerChoice.equals("scissors") ||
            (userChoice.equals("scissors") && computerChoice.equals("paper")) ||
            (userChoice.equals("paper") && computerChoice.equals("rock"))
        )) {
            return "You win!";
        } else {
            return "You Lose!";
        }
    }
}
