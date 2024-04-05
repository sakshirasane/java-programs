package loopingex;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		int n,rev=0,rem;
		Scanner sc= new Sacnner(System.in);
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		
		int orignal = n;
		while(n>0) {
			rem= n % 10;
			rev= (rev*10)+rem;
			n=n/10;
		}
		if(original==rev)
			System.out.println("Palindrome");
		
		
	else
	
		System.out.println("Not palindrome");
		
		// TODO Auto-generated method stub
	}
	

}
