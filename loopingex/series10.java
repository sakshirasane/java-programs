package loopingex;

public class series10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float i,j,fact,sum=0;
 for (i=1;i<=5;i++) {
	 System.out.print((int)i+"/"+(int)i+"!");
	 
	 fact=1;
	 for(j=1;j<=i;j++) {
		 fact=fact*j;
		 
	 }
	 sum=sum+(i/fact);
	 if(i<5)
	 System.out.print(" + ");
	 
 }
 System.out.print(" = "+sum);
	}

}
