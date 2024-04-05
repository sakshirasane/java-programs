package loopingex;

import java.util.Scanner;

public class series1 {

	public static void main(String[] args) {
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		n=sc.nextInt();
		for(i=1;i<=n;i++) {
			if(i%2 !=0)
			{
				System.out.print(i);
			}
		}
		// TODO Auto-generated method stub

	}

}
