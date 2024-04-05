package java8features;


@FunctionalInterface
interface PercentageCalculator {
    double calculatePercentage(double m1, double m2, double m3);
}

public class lambdaEx4 {
	
	    public static void main(String[] args) {
	        // Implementing the functional interface using a lambda expression
	        PercentageCalculator calculator = (double m1, double m2, double m3) -> ((m1 + m2 + m3) / 3.0);

	        // Using the implemented lambda expression
	        double marks1 = 85;
	        double marks2 = 90;
	        double marks3 = 95;
	        double percentage = calculator.calculatePercentage(marks1, marks2, marks3);
	        System.out.println("Percentage: " + percentage);
	    }
	}


