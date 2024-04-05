package loopingex;

import java.util.Scanner;

public class factorialnumber {

	public static void main(String[] args) {

		int i,fact =1,number;
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		
		for(i=1;i<=number;i++)
		{
			fact *=i;
		}
		System.out.println("facttorial of"+number+"is: "+fact);
		

	}

}
