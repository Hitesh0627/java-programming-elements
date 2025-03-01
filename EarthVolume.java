public class EarthVolume {
    public static void main(String[] args) {
        // Radius of Earth in kilometers
        double radiusKm = 6378;
        
        // Calculate the volume of the Earth in cubic kilometers using the formula for the volume of a sphere
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        
        // Conversion factor from cubic kilometers to cubic miles
        double kmToMilesConversionFactor = 0.239913;
        
        // Convert the volume from cubic kilometers to cubic miles
        double volumeMi3 = volumeKm3 * kmToMilesConversionFactor;

        // Print the results
        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMi3);
    }
}
