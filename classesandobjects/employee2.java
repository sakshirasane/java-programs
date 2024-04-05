package classesandobjects;

import java.util.Scanner;

public class employee2 {
	String empname;
	int empcode ;
	double basicsalary, allowance, grossSalary,tax,netSalary;
	
	public void accept() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter emp code: ");
		empcode=sc.nextInt();
		sc.nextLine();
		System.out.println("empname: ");
		empname=sc.nextLine();	
	     System.out.println("Enter your basic salary: ");
	     basicsalary =sc.nextDouble();
	     
	     
	}
	public void allow() {
		allowance=basicsalary*0.55;
		
	}
	public void gross(){
		grossSalary=basicsalary+allowance;
		
	}
	public void tax() {
		tax=grossSalary*0.12;
		
		
	}
	public void net() {
		netSalary=grossSalary-tax;
	}

	public void display() {
		System.out.println("empcode: "+empcode);
		System.out.println("empname: "+empname);
		System.out.println("basicsalary:"+basicsalary);
		System.out.println("Allowance: "+allowance);
		System.out.println("tax="+tax);
		System.out.println("netsalary:"+netSalary);
		}
	public static void main(String[]args) {
		employee2 emp=new employee2();
		emp.accept();
		emp.allow();
		emp.gross();
		emp.tax();
		emp.net();
		emp.display();
	}
}
