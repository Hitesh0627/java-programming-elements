import java.util.Scanner;

public class KmToMilesConverter2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt the user for the distance in kilometers
        System.out.print("Enter the distance in kilometers: ");
        
        // Read the input as a double
        double km = input.nextDouble();
        
        // Convert kilometers to miles using the formula (1 mile = 1.6 km)
        double miles = km / 1.6;
        
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km.");
        
        input.close();
    }
}
