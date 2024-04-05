package arrayex;

import java.util.Scanner;

public class Arrayex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int[]a= {1,2,3,4,5};
int i;
//for( i=0;i<a.length;i++) {
	//System.out.println(a[i]);
//}
int size;
Scanner sc=new Scanner(System.in);
System.out.println("Enter array size: ");
size=sc.nextInt();
int b[]=new int[size];

System.out.println("Enter "+size+ "Array Elements : ");

for(i=0;i<b.length;i++) {
	b[i]=sc.nextInt();
}
	System.out.println( "Arrray");
    for(i=0;i<b.length;i++) {
    	System.out.println(b[i]);
    
	
}

	}

}
