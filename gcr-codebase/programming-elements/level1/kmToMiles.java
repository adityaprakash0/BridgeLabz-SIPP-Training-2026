public class KmToMiles {
    public static void main(String[] args) {
        // Define the fixed distance in kilometers
        double distanceKm = 10.8;
        
        // Define the conversion rate (1 km = 1.6 miles)
        double kmToMilesConversion = 1.6; 
        
        // Calculate the distance in miles
        double distanceMiles = distanceKm / kmToMilesConversion;
        
        // Display the result
        System.out.println("The distance " + distanceKm + " km in miles is " + distanceMiles);
    }
}