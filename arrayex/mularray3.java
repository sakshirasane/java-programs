package arrayex;

import java.util.Scanner;

public class mularray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rowsize,columnsize,i,j;
		
		int[][]a= {{1,2},{2,3}};

        for(i=0;i<=1;i++)
       {
	       for(j=0;j<=1;j++)
	        {
		        System.out.print(a[i][j]+" ");
		
	        }
	        System.out.println();
       }
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter rowsize and column size: ");
		rowsize=sc.nextInt();
		columnsize=sc.nextInt();
		

		int b[][]= new int[rowsize][columnsize];

		System.out.println("Enter array elemnets: ");
		for(i=0;i<rowsize;i++)
		{
			for(j=0;j<columnsize;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("Array: ");
		for(i=0;i<rowsize;i++)
		{
			for(j=0;j<columnsize;j++)
			{
				System.out.printf(a[i][j]+b[i][j]+" ");
			}
			System.out.println();
		}




	}

}
