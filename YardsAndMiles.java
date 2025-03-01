import java.util.Scanner;

public class YardsAndMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble(); 

        // Convert feet to yards
        double distanceInYards = distanceInFeet / 3;

        // Convert yards to miles
        double distanceInMiles = distanceInYards / 1760;

        System.out.println("The distance in yards is " + distanceInYards + " and in miles is " + distanceInMiles);

        input.close();
    }
}
