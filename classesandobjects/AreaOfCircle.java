package classesandobjects;

public class AreaOfCircle {
	double x;
	public AreaOfCircle() {
		x=6;
		
	}
	public AreaOfCircle(double x){
		this.x=x;
			}
	public void calculate() {
		double area=3.14*x*x;
		System.out.println("Area of Circle: "+area);
		
	}

	public static void main(String args[]) {
		
		AreaOfCircle obj=new AreaOfCircle();
		obj.calculate();
		AreaOfCircle obj1=new AreaOfCircle(3);
		obj1.calculate();
	}
	
}
