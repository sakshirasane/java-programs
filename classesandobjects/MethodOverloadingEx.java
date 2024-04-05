package classesandobjects;

public class MethodOverloadingEx {

	public void area(float radius) {
		System.out.println("Area of circle: "+(3.14*radius*radius));
	}
	//different return type	
	//public void area(int length,int breadth) {
		//System.out.println("Area of rectangle: "+(length*breadth));
	//}
	public int area(int length,int breadth) {
		System.out.println("Area of rectangle: "+(length*breadth));
		return length*breadth;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingEx obj=new MethodOverloadingEx();
		obj.area(10);
		//obj.area(10, 20);
int res=obj.area(5, 27);
System.out.println("Area of rectangle: "+res);
	}

}
