package relationshipex;

public class SalesPerson extends Employe {
	
	float sales,commission,totalsalary;
	
	
	public SalesPerson() {
		super();
		sales=70;
	}

	
	
	public SalesPerson(int id,String name,MyDate dob,Address add, float PerDay,float WorkingDays,float sales) {
		super(id,name,dob,add,PerDay,WorkingDays);
		this.sales=sales;
		
		
	}
	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		super.calculate();
		if (sales>95)
			commission=Salary*0.2f;
		else if(sales>75)
			commission=Salary*0.15f;
		else if(sales>60)
			commission=Salary*0.1f;
		else
			commission=0;
		totalsalary=Salary+commission;
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("sales: "+sales);
		System.out.println("commission: "+commission);
		System.out.println("totalsalary: "+totalsalary);
	}
}
