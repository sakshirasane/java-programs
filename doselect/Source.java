package doselect;

public class Source {
	    public int getSecondSmallest(int[] arr) {
	        if (arr.length < 2) {
	            System.out.println("Invalid input: Array must have at least two elements");
	            return Integer.MIN_VALUE; // Return minimum integer value to indicate error
	        }

	        int smallest = Integer.MAX_VALUE;
	        int secondSmallest = Integer.MAX_VALUE;

	        for (int num : arr) {
	            if (num < smallest) {
	                secondSmallest = smallest;
	                smallest = num;
	            } else if (num < secondSmallest && num != smallest) {
	                secondSmallest = num;
	            }
	        }

	        if (secondSmallest == Integer.MAX_VALUE) {
	            System.out.println("There is no second smallest element");
	            return Integer.MIN_VALUE; // Return minimum integer value to indicate error
	        }

	        return secondSmallest;
	    }

	    public static void main(String[] args) {
	        int[] arr = {23, 45, 32, 22, 20, 96};
	        Source source = new Source();
	        int secondSmallest = source.getSecondSmallest(arr);
	       
	        System.out.println("Second smallest element: " + secondSmallest);
	    }
	}


