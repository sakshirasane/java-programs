package patternex;

import java.util.Scanner;

public class pattern1 {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
	    int c=sc.nextInt();
	    int i,j;
	    for(i=0;i<=a;i++) {
	    	for(j=1;j<=a-i;j++) {
	    		System.out.print(" ");
	    		
	    	}
	    	
	    	for(j=1;j<=i;j++) {
	    		System.out.print(i+ " ");
	    	}
	    	System.out.println();
	    	
	    }
	    for(i=0;i<=b;i++) {
	    	for(j=1;j<=b-i;j++) {
	    		System.out.print(" ");
	    		
	    	}
	    	
	    	for(j=1;j<=i;j++) {
	    		System.out.print(i+ " ");
	    	}
	    	System.out.println();
	    	
	    }
	    for(i=0;i<=c;i++) {
	    	for(j=1;j<=c-i;j++) {
	    		System.out.print(" ");
	    		
	    	}
	    	
	    	for(j=1;j<=i;j++) {
	    		System.out.print(i+ " ");
	    	}
	    	System.out.println();
	    	
	    }
	    
	    
}

}
