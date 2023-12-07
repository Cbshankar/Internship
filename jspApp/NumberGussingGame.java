package org.jspApp;

import java.util.Random;
import java.util.Scanner;

public class NumberGussingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        int maxAttempts = 7;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        boolean playAgain = true;
        while (playAgain) {
            int generatedNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("Guess a number between " + lowerBound + " and " + upperBound + ".");
            
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == generatedNumber) {
                    guessedCorrectly = true;
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    score++;
                    break;
                } else if (userGuess < generatedNumber) {
                    System.out.println("Too low! Try a higher number.");
                } else {
                    System.out.println("Too high! Try a lower number.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all your attempts. The number was: " + generatedNumber);
            }

            System.out.println("Your current score: " + score);
            System.out.print("Would you like to play again? (yes/no): ");
            String playChoice = scanner.next().toLowerCase();
            playAgain = playChoice.equals("yes") || playChoice.equals("y");
        }

        System.out.println("Thank you for playing the Number Guessing Game!");
        scanner.close();
    }
}



