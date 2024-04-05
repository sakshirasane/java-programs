package java8features;


@FunctionalInterface
interface Squaring {
    int square(int n);
}

public class LambdaEx1 {

	public static void main(String[] args) {
	        // Implementing the functional interface using a lambda expression
	        Squaring squaring = (int n) -> n * n;

	        // Using the implemented lambda expression
	        int result = squaring.square(5);
	        System.out.println("Square of 5 is: " + result);
	    }
	}


