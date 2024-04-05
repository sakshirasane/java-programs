package arrayex;

public class array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,3,0,4,-2,0,-1,0,8};
		
	int i, p=0,n=0,zero=0;
		for( i=0;i<a.length;i++)
		{
			if(a[i]>0)
				p++;
			else if(a[i]<0)
				n++;
			else 
				zero++;
			
		}
	System.out.println("positive Numbers: "+p);
	System.out.println("negative Numbers: "+n);
	System.out.println("zeroes are: "+zero);

}
}