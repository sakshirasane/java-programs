package classesandobjects;


	import java.util.Scanner;

	public class parametarizedmethodex {

		//parameterized without return type 
		public void mul(double x, double y)
		{
			System.out.println("Mul : "+(x*y));
		}
		
		//parameterized with return type 
		public double div(double x,double y){
			return x/y;
		}
		
		public static void main(String[] args) {
			double a,b;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 2 numbers");
			a = sc.nextDouble();
			b = sc.nextDouble();
			
			 parametarizedmethodex obj = new parametarizedmethodex ();
			obj.mul(a, b);
			double res = obj.div(a, b);
			System.out.println("Div : "+res);
		}
	}


