package NumberGuessing;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int lowerBound = 1;
		int upperBound = 100;
		int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
		int maxAttempts = 10;
		int remainingAttempts = maxAttempts;

		System.out.println("Welcome to the Number Guessing Game!");
		System.out.println("I have selected a number between 1 and 100 (inclusive). Try to guess it!");

		while (remainingAttempts > 0) {
			System.out.print("Enter your guess (between 1 and 100): ");
			int userGuess = scanner.nextInt();

			if (userGuess < lowerBound || userGuess > upperBound) {
				System.out.println("Please enter a valid number between 1 and 100.");
				continue;
			}

			if (userGuess == targetNumber) {
				System.out.println("Congratulations! You guessed the correct number: " + targetNumber);
				break;
			} else if (userGuess < targetNumber) {
				System.out.println("Too low! Try again.");
			} else {
				System.out.println("Too high! Try again.");
			}

			remainingAttempts--;
			System.out.println("Remaining attempts: " + remainingAttempts);

			if (remainingAttempts == 0) {
				System.out.println("Sorry, you've run out of attempts. The correct number was: " + targetNumber);
			}
		}

		scanner.close();
	}
}
