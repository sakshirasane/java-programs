package doselect;

	import java.util.Scanner;

	public class DistanceTraveled {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Constants
	        final double initialVelocityKmPerHr = 36.0;
	        final double accelerationMetersPerSecondSq = 5.0;
	        final double kilometerToMeterConversion = 1000.0;
	        final double hourToSecondConversion = 3600.0;

	        // Input time intervals
	        System.out.println("Enter the time intervals in seconds (one interval per line):");
	        int time1 = scanner.nextInt();
	        int time2 = scanner.nextInt();

	        // Calculate distance for each time interval
	        double distance1 = calculateDistance(initialVelocityKmPerHr, accelerationMetersPerSecondSq,
	                time1);
	        double distance2 = calculateDistance(initialVelocityKmPerHr, accelerationMetersPerSecondSq,
	                time2);

	        // Output distances in meters
	        System.out.println("Distance travelled in meters for time interval 1: " + (int) (distance1 * kilometerToMeterConversion));
	        System.out.println("Distance travelled in meters for time interval 2: " + (int) (distance2 * kilometerToMeterConversion));
	    }

	    // Method to calculate distance
	    public static double calculateDistance(double initialVelocityKmPerHr, double accelerationMetersPerSecondSq,
	                                           int timeInSeconds) {
	        // Convert initial velocity from km/hr to m/s
	        double initialVelocityMetersPerSecond = initialVelocityKmPerHr * 1000.0 / 3600.0;

	        // Calculate distance using the formula
	        double distance = initialVelocityMetersPerSecond * timeInSeconds +
	                0.5 * accelerationMetersPerSecondSq * timeInSeconds * timeInSeconds;

	        return distance;
	    }
	}


