public class VolumeOfEarth {
    public static void main(String[] args) {
        // Define the radius of the Earth in kilometers
        double radiusKm = 6378.0;
        
        // Calculate the volume in cubic kilometers
        // Note: We use 4.0 / 3.0 to ensure Java uses decimal division instead of integer division
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        
        // Convert the radius to miles first (using the 1 mile = 1.6 km hint from earlier)
        double radiusMiles = radiusKm / 1.6; 
        
        // Calculate the volume in cubic miles
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);
        
        // Display the results
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}