package classesandobjects;

import java.util.Scanner;

public class employee {
	int empid;
	String empname;
	int workingdays;
	int perday;
	public void accept() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter empid: ");
		empid =sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter empname: ");
		empname=sc.nextLine();
		System.out.println("Enter workingdays: ");
		workingdays=sc.nextInt();
		System.out.println("Enter perday: ");
		perday=sc.nextInt();
		
	}
	public void calculate() {
		float salary;
		salary=perday*workingdays;
		System.out.println("empid: "+empid);
		System.out.println("empname: "+empname);
		System.out.println("empworkingdays: "+workingdays);
		System.out.println("perday: "+perday);
		System.out.println("empsalary: "+salary);
		
	}
	public static void main(String args[]) {
		employee emp1=new employee();
		emp1.accept();
		emp1.calculate();
	}

}
