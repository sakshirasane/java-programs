package classesandobjects;

import java.util.Scanner;

public class Student1 {
int id;
String name;
float physics,chemistry,maths,percentage,total;

  public Student1(int id,String name,float physics,float chemistry,float maths) {
	  this.id=id;
	  this.name=name;
	  this.physics=physics;
	  this.chemistry=chemistry;
	  this.maths=maths;
	  }
  public void calculate() {
	  total=physics+maths+chemistry;=total/3;
	  System.out.println("total="+total);
	  System.out.println("percentage= "+percentage);
	  
  }
  public static void main(String args[]) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter id= ");
	 int  id=sc.nextInt();
       sc.nextLine();
       System.out.println("enter name: ");
       String name= sc.nextLine();
       System.out.println("marks of physics: ");
       float physics=sc.nextFloat();
       System.out.println("marks ofchemistry: ");
       float chemistry=sc.nextFloat();
       System.out.println("marks of maths: ");
       float maths=sc.nextFloat();
       
       
       Student1 s1=new Student1(id,name,physics,chemistry,maths);
       s1.calculate();
       
       
       
	  
	  
			
  }
}
