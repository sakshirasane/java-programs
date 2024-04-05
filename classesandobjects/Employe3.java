package classesandobjects;

import java.util.Scanner;

public class Employe3{
	
    int id;
	String empname;
    int workingdays;
    double  perday;
    
    public Employe3() {
    	id=101;
    	empname="sakshi";
    	workingdays=30;
    	perday=2000;
    	}
    
    
    
    public Employe3(int id,String empname,int workingdays,double perday) {
    	this.id=id;
    	this.empname=empname;
    	this.workingdays=workingdays;
    	this.perday=perday;
    	
    	
    }
    public void calculate() {
    	double salary=workingdays*perday;
    	System.out.println("salary= "+salary);
    }
    
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		 
		
		System.out.println("Enter empid: ");
		int empid=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter empname: ");
		String empname=sc.nextLine();
		System.out.println("Enter workingdays: ");
		int workingdays=sc.nextInt();
		System.out.println("Enter perday: ");
	     double perday=sc.nextDouble();
	     
	     
	     
	     Employe3 obj=new Employe3();
	     obj.calculate();
	    
	     
	     Employe3 obj1=new Employe3(empid,empname,workingdays,perday);
	     obj1.calculate();
	     }
	}
