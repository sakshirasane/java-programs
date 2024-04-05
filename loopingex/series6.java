package loopingex;

import java.util.Scanner;

public class series6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float i,sum=0;
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++);{
			sum=sum+(i/i);
			System.out.print((int)i +"/"+(int)i);
			if(i<n)
				System.out.print(" + ");
			
		}
		System.out.print(" = "+sum);

	}

}
