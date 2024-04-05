package loopingex;

import java.util.Scanner;

public class series5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				System.out.print(i*i);
				
			}
		}

	}

}
