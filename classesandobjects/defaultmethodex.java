package classesandobjects;

	import java.util.Scanner;


    public class defaultmethodex {

		int a,b;
		
		//default method without return type
		public void accept()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 2 numbers");
			a = sc.nextInt();
			b = sc.nextInt();
		}
		
		//default method with return type
		public int add() {
			return a+b;
		}
		
		public int sub() {
			return a-b;
		}
		
		public static void main(String[] args) {
			defaultmethodex obj = new defaultmethodex();
			obj.accept();
			int a = obj.add();
			int b = obj.sub();
			System.out.println("Add : "+a);
			System.out.println("Sub : "+b);
		}
	}





