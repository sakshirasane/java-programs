package abstraction;

public abstract class Vehicle {
public  Vehicle() {
	System.out.println("constructor in abstract class....");
}
	public  void run() {
		
		System.out.println("runnig safely");
	}
	
	public abstract void changedGear();
	
}
