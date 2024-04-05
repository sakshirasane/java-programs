package arrayex;

import java.util.Scanner;

public class array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // int a[]= {2,7,23,45,9,4,10};
        int  i,size;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        size=sc.nextInt();
        int a[]=new int[size];
        
        System.out.println("Enter "+size+ "array elements: ");
        for(i=0;i<a.length;i++)
        {
        	a[i]=sc.nextInt();
        	}
        int highest = a[0],lowest =a[0];
        
        for(i=0;i<a.length;i++) {
        if(a[i]>highest)
        	highest=a[i];
        }
        System.out.println(" highest number "+highest);
        
        for (i=1;i<a.length;i++)
        {
        	if(a[i]<lowest)
        		lowest=a[i];
        }
System.out.println("lowest number : "+lowest);
}
}