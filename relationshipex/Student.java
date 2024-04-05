package relationshipex;

public class Student extends person {
float Physics,Chemistry,Maths,total,percentage;

public Student() {
	super();
	this.Physics=70;
	this.Chemistry=80;
	this.Maths=90;
	
}
   public Student(int id,String name,float Physics,float Chemistry,float Maths,MyDate dob,Address add) {
	   super(id,name,dob,add);
	   this.Physics=Physics;
	   this.Chemistry=Chemistry;
	   this.Maths=Maths;
   }

public void calculate() {
	total=Physics+Chemistry+Maths;
	percentage=total/3;
}
public void display() {
	super.display();
	System.out.println("total: "+total);
	System.out.println("percentage: "+percentage);
}

}
