package java8features;


@FunctionalInterface
interface SimpleInterestCalculator {
    float calculateSimpleInterest(float p, float n, float r);
}
public class LambdaEx3 {
	


	    public static void main(String[] args) {
	        // Implementing the functional interface using a lambda expression
	        SimpleInterestCalculator calculator = (float p, float n, float r) -> (p * n * r) / 100;

	        // Using the implemented lambda expression
	        float principal = 1000;
	        float time = 2;
	        float rate = 5;
	        float simpleInterest = calculator.calculateSimpleInterest(principal, time, rate);
	        System.out.println("Simple Interest: " + simpleInterest);
	    }
	}


