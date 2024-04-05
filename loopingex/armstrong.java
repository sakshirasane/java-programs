package loopingex;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		int n,rev=0,rem,orignal,number,digits;
		double result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number: ");
		n=sc.nextInt();
	number = n;
	orignal= number;
	
	digits=0;
	while(orignal  !=0) {
		orignal /=10;
		++digits;
		
	}
	if(number==result)
		System.out.println("Number is armstrong");
	else
		System.out.println("number is not armstrong");
	}

}
