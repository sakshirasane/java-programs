package classesandobjects;

import java.util.Scanner;

public class student {
int rollnumber;
String name;
float java,cpp,python;

public void accept() {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter roll number");
	rollnumber=sc.nextInt();
	
	sc.nextLine();
	
	System.out.println("Enter name: ");
	name=sc.nextLine();
	
	System.out.println("Enter marks of java,cpp,python: ");
	java=sc.nextFloat();
	cpp=sc.nextFloat();
	python=sc.nextFloat();
	}

    public void calculate() {
	
	float total,percent;
	total=java+cpp+python;
	percent=total/3;
	System.out.println("student Rollnumber: "+rollnumber);
	System.out.println("student name: "+name);
	System.out.println("student total: "+total);
	System.out.println("student percent: "+percent);
}
    public static void main(String args[]) {
    	
    	
    	student student1= new student();
    	student1.accept();
    	student1.calculate();
    	//System.out.println(rollnumber);can not be used in static method
    }
}
