import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter base and height in centimeters
        System.out.print("Enter the base of the triangle in cm: ");
        double base = input.nextDouble();  // User input for base in cm

        System.out.print("Enter the height of the triangle in cm: ");
        double height = input.nextDouble();  // User input for height in cm

        // Calculate the area of the triangle in square centimeters
        double areaCm2 = 0.5 * base * height;

        // Convert the area from square centimeters to square inches
        double areaIn2 = areaCm2 * 0.155;

        System.out.println("The area of the triangle is " + areaCm2 + " square centimeters and " + areaIn2 + " square inches.");

        input.close();
    }
}
