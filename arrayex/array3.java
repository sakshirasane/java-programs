package arrayex;

import java.util.Scanner;

public class array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,size,even=0,odd=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter size if an array: ");
size=sc.nextInt();
 int a[]=new int[size];
System.out.println("array size: "+size+  "array elements: ");
for( i=0;i<a.length;i++) {
	a[i]=sc.nextInt();
	
}


for(i=0;i<a.length;i++) {
    if(a[i]%2==0)
    	even +=a[i];
    else
    	odd+=a[i];
 	 
 	   
}

System.out.println("even numbers: "+even);
System.out.println("odd numbers: "+odd);


	}

}
