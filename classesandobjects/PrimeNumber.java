package classesandobjects;

import java.util.Scanner;

public class PrimeNumber {
	int i,n;
	boolean b= false;
	
	public void prime() {
		for(i=2;i<n/2;i++) {
			if(n%i==0)
			{
				b=true;
				break;
			}
		}
		if(b==true)
		{
			System.out.println("No is not prime");
		}
		else {
			System.out.println("No is prime");
		}
	
	
	
	

	public static void main(String[] args){
		int n;
		// TODO Auto-generated method stub
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter No: ");
       n=sc.nextInt();
		
		
		
	

}
	}
}