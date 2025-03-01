import java.util.Scanner;

public class QuotientAndRemainder {

    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the first number
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        // Ask the user to input the second number
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Calculate the quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Display the result
        System.out.printf("The Quotient is %d and Reminder is %d of two numbers %d and %d\n", quotient, remainder, number1, number2);
        scanner.close();
    }
}
