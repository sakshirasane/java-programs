package classesandobjects;

public class staticex {
	int rollnumber;
	String name;
	static String instituetname="Edubridge Learning";

	public staticex() {
		
	}
	public staticex(int rno, String nm) {
		rollnumber=rno;
		name=nm;
		
		}
	static {
		System.out.println("it is called before main()");
	}
	
	{
		System.out.println("Instace block");
	}
	public void display() {
		System.out.println("rollno: "+rollnumber);
		System.out.println("name: "+name);
		System.out.println("Instituetname: "+instituetname);
	}
	public static void changename(String newInstitutename) {
		instituetname=newInstitutename;
		
	}
	public static void main(String args[]) {
		staticex.changename("Edubridge learning pvt ltd");
		
		staticex stud1= new staticex(101,"sakshi");
		stud1.display();
		
		staticex stud2 = new staticex(102,"suraj");
		stud2.display();
		
		
	}

}
