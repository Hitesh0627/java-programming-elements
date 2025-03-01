public class DistanceConverter {
    public static void main(String[] args) {
        // Given distance in kilometers
        double kilometers = 10.8;

        // Conversion factor
        double kilometersToMiles = 1.6;

        // Calculate the distance in miles
        double miles = kilometers * kilometersToMiles;

        // Print the result
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}
