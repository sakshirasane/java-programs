package relationshipex;

public class Student1 extends Student {
	
	int A,B,C,D,fail, grade;
	float percentage;
	public Student1() {
		super();
		percentage=95;
	}
	
	public Student1(int id,String name,float Physics,float Chemistry,float Maths,MyDate dob,Address add,float percentage) {
		
		super(id, name, Physics, Chemistry, Maths, dob, add);
		this.percentage=percentage;
	}
	
	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		super.calculate();
	     if(percentage>=90f)
	    	 grade=A;
	     else if(percentage>=75f)
	    	 grade=B;
	     else if(percentage>=61f)
	    	 grade=C;
	     else if(percentage>=50f)
	    	 grade=D;
	     else
	    	 grade=fail;
	
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
	  System.out.println("Grade= "+grade);
	
	
	}
	

}
