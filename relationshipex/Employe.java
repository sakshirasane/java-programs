package relationshipex;

public class Employe  extends person{
	float PerDay,WorkingDays,Salary;
	
	public Employe() {
		super();
		this.PerDay=1200;
		this.WorkingDays=30;
	}
	public Employe(int id,String name,MyDate dob,Address add, float PerDay,float WorkingDays) {
		super(id,name,dob,add);
		this.PerDay=PerDay;
		this.WorkingDays=WorkingDays;
		
	}
	public void calculate() {
		Salary=WorkingDays*PerDay;
	}
	
	public void display() {
		super.display();
		System.out.println("Salary: "+Salary);	
		
	}
}
