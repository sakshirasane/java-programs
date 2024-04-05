package classesandobjects;

public class simpleinterest {
	double principleamt,rate,years;
	public simpleinterest()
	{
		principleamt=25000;
		rate=6.7;
		years=2;
		
	}
	
	public simpleinterest(double principleamt,double rate,double years) {
		this.principleamt = principleamt;
		this.rate=rate;
		this.years=years;
		
		
	}
public void calculate() {
	double interest = principleamt*rate*years;
	System.out.println("simple interest: "+interest);
	
}
	
public static void main(String args[]) {
	simpleinterest interest1=new simpleinterest();
	interest1.calculate();
	
	simpleinterest interest2= new simpleinterest(65000,7.2,3);
	interest2.calculate();
}
}
