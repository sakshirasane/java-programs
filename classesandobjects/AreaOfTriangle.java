package classesandobjects;

public class AreaOfTriangle {
	double base, height;
	public AreaOfTriangle() {
		base=6;
		height=8;
		}
	public AreaOfTriangle(double base,double height) {
		this.base=base;
		this.height=height;
		}
	public void Calculate() {
		double area=base*height;
		System.out.println("Area of Triangle: "+area);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     AreaOfTriangle obj=new AreaOfTriangle();
      obj.Calculate();
      
     AreaOfTriangle obj1= new AreaOfTriangle(9, 5);
     obj1.Calculate();
	}

}
