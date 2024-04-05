package abstraction;

public class Drawableimpl implements Drawable,Printable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Drawableimpl drawable =new Drawableimpl();
     drawable.print();
     drawable.cube(7);
     Drawable.square(13);
     drawable.display();
     drawable.show();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
	float r=10;
	System.out.println("Area of circle: "+(PI*r*r));
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("method from another interface");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		Drawable.super.show();
	}
	

}
