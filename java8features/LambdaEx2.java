package java8features;



@FunctionalInterface
interface Circle {
    double calculateArea(float r);
}


public class LambdaEx2 {
	

	    public static void main(String[] args) {
	        // Implementing the functional interface using a lambda expression
	        Circle circle = (float r) -> Math.PI * r * r;

	        // Using the implemented lambda expression
	        float radius = 3.5f;
	        double area = circle.calculateArea(radius);
	        System.out.println("Area of the circle with radius " + radius + " is: " + area);
	    }
	}


