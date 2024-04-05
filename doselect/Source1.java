
package doselect;

	import java.util.Scanner;
import java.util.stream.Collectors;


public class Source1 {
	    public String insertSpace(String s) {
	        return s.chars()
	                .mapToObj(c -> (char) c + " ")
	                //.collect(Collector.joining);
	                .reduce("",String::concat)
	                .trim(); // Remove trailing space
	    }

	    public static void main(String[] args) {
	        Source1 source = new Source1();
	       // String input = "capgemini";
	        Scanner sc= new Scanner(System.in);
	        String str=sc.nextLine();
	        String formattedString = source.insertSpace(str);
	        System.out.println("Formatted string: " + formattedString);
	    }
	}

