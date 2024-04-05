package classesandobjects;

import java.util.Scanner;

public class area {
int x,y;
public void circle(double x){
	double x=3.4*x*x;
	System.out.println("area of circle: "+x);
}
public void triangle(double  base,double height) {
	double area=base*height;
	System.out.println("area of triangle: "+area);
	}

public void square(int n) {
	double area=n*n;
	System.out.println("area of square: "+n);
}
public void rectangle(double length,double width){
	double area=length*width;
	System.out.println("area of rectangle: "+area);
	
}

public static void main(String[] args) {
	double a,b;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 2 numbers");
	a = sc.nextDouble();
	b = sc.nextDouble();

	area a1=new area();
	a1.

}
}
