import java.util.InputMismatchException;
import java.util.Scanner;

public class KittyBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Greeting
        System.out.println("Hello! My name is Kitty.");
        System.out.println("I was created in 2023.");

        // Ask for username
        System.out.println("Please, remind me your name.");
        String yourName = scanner.nextLine();
        System.out.println("What a great name you have, " + yourName + "!");

        // Guess the age
        System.out.println("Let me guess your age.");
        int remainder3 = getIntInput(scanner, "Enter remainder of dividing your age by 3:");
        int remainder5 = getIntInput(scanner, "Enter remainder of dividing your age by 5:");
        int remainder7 = getIntInput(scanner, "Enter remainder of dividing your age by 7:");

        // Age calculation
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");

        // Count from 0 to a number
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int number = getIntInput(scanner, "Enter a positive number:");

        for (int i = 0; i <= number; i++) {
            System.out.println(i + " !");
        }

        // Conduct a test
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");

        int correctAnswer = 2;

        while (true) {
            int userAnswer = getIntInput(scanner, "> ");
            if (userAnswer == correctAnswer) {
                System.out.println("That's correct! Well done.");
                break;
            } else {
                System.out.println("Please, try again.");
            }
        }

        // Goodbye message
        System.out.println("Completed, have a nice day!");
        scanner.close();
    }

    /**
     * Utility method to safely get integer input from the user.
     */
    private static int getIntInput(Scanner scanner, String prompt) {
        while (true) {
            System.out.println(prompt);
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }
    }
}
