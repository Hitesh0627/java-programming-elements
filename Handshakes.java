import java.util.Scanner;

public class Handshakes {

    // Function to calculate the maximum number of handshakes
    public static int calculateHandshakes(int numberOfStudents) {
        // Formula for combination C(n, 2) = (n * (n - 1)) / 2
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        int handshakes = calculateHandshakes(numberOfStudents);

        System.out.println("The maximum number of possible handshakes among " + numberOfStudents + " students is: " + handshakes);

        scanner.close();
    }
}
