package classesandobjects;

public class areaofrectangle {
	double length,width,area;
	
	public areaofrectangle() {
		length=6;
	    width=5;
		}
	
	public  areaofrectangle(double length,double width){
		this. length= length;
		this. width = width;
		 
	}
	public void calculate() {
		double area=length+width;
     System.out.println("area: "+area);
	}
	
	public static void main(String[] args) {
		areaofrectangle area= new areaofrectangle();
		area.calculate();
		
		
		areaofrectangle area1= new areaofrectangle(2,2);
		area1.calculate();
		
}
}
