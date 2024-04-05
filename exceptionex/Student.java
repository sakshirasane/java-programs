package exceptionex;

public class Student {
static void findByRollNumber(int rollNumber) throws StudentNotFoundException{
	if(rollNumber>=1 && rollNumber<=20)
		System.out.println("Student Found");
	else
		throw new StudentNotFoundException("Student not found: "+rollNumber);
	
		
}
public static void main(String args[]) {
	try {
		findByRollNumber(25);
	}catch(StudentNotFoundException e) {
		e.printStackTrace();
	}
	System.out.println("rset of code....");
}
}
