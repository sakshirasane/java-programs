package loopingex;

import java.util.Scanner;

public class series3 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
       int n;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number: ");
       n=sc.nextInt();
       for(int i=1;i<=n;i++) {
    	   System.out.print(i*i*i +"  ");
       }
    	   
       }

}
