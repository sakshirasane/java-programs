package arrayex;

import java.util.Scanner;

public class array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int  i,j,t,size;
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter array size: ");
	        size=sc.nextInt();
	        int a[]=new int[size];
	        System.out.println("Enter "+size+ "array elements: ");
	        for(i=0;i<a.length;i++) {
	        	a[i]=sc.nextInt();
	        }
	        
	        
	        
	        for (i=0;i<a.length-1;i++)
	        {
	        	for(j=i+1;j<a.length;j++)
	        	{
	        		if(a[i]>a[j]) {
	        			t=a[i];
	        			a[i]=a[j];
	        			a[j]=t;
	        		}
	        	}
	        			
	        }
	        System.out.println("Ascending order : ");
	        for (i=0;i<a.length;i++)
	        {
	        	
	        	System.out.println(" "+a[i]);	
	        }
	

	}

}
