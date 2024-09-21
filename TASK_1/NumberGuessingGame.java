import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        Random randomGenerator = new Random();
        int maxAttempts = 10; 
        int totalScore = 0; 

        System.out.println("WELCOME TO THE NUMBER GUESSING GAME...!");
        System.out.println("I'm thinking of a number between 1 and 100");

        boolean continuePlaying = true;

        while (continuePlaying) {
            int targetNumber = randomGenerator.nextInt(100) + 1;
            int attemptCount = 0;
            boolean isGuessedCorrectly = false;

            System.out.println("Try to guess it...!");
            System.out.println("You have " + maxAttempts + " attempts.....!!!");

            while (attemptCount < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = inputScanner.nextInt();
                attemptCount++;

                if (userGuess == targetNumber) {
                    System.out.println("You guessed the number in " + attemptCount + " attempts.");
                    totalScore++;
                    isGuessedCorrectly = true;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Guess a bit higher.");
                } else {
                    System.out.println("A bit lower.");
                }
            }

            if (!isGuessedCorrectly) {
                System.out.println("Ran out of attempts, correct answer was... " + targetNumber);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playerChoice = inputScanner.next().toLowerCase();
            continuePlaying = playerChoice.equals("yes") || playerChoice.equals("y");

            System.out.println();
        }

        System.out.println("Game over! Your total score is: " + totalScore);
        inputScanner.close();
    }
}
