package arrayex;

import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int i,size,even ;
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter size of an  array: ");
     size= sc.nextInt();
     int a[]= new int[size];
     System.out.println(" Enter size: "+size+"\nArray Elements: ");
     for(i=0;i<a.length;i++) {
    	 a[i]=sc.nextInt();
     }
     System.out.println("even numbers: ");
     for(i=0;i<a.length;i++) {
       if(a[i]%2==0)
    	 
    	   System.out.println("even numbers: "+a[i]);
 
   
     }
    
}
}