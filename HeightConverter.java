import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();  // User input for height in cm

        // Convert height from centimeters to inches
        double heightInches = heightCm / 2.54;

        // Calculate feet and remaining inches
        int feet = (int) heightInches / 12;  // Integer division for feet
        int inches = (int) heightInches % 12;  // Remainder gives the extra inches

        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);

        input.close();
    }
}
