package relationshipex;

public class Customer extends person {
	String prodName;
	float quantity;
	float price,billAmount,discount,finalbill;
	
	public Customer(){
		super();
		prodName="perfumes";
	   quantity=50;
		price=1000;
	   
	}
	public Customer(int id,String name,MyDate dob,Address add,String prodNmae,float quantity,float price) {
		super(id, name, dob, add);
		this.prodName=prodNmae;
		this.quantity=quantity;
		this.price=price;
		
	}
	public void calculate() {
		float nodiscount = 0;
		billAmount=quantity*price;
		if(billAmount>=20000)
			discount=billAmount*0.15f;
		else if(billAmount>=15000)
			discount=billAmount*0.7f;
		else if(billAmount>1000)
			discount=billAmount*0.1f;
		else 
			discount=nodiscount;
		finalbill=billAmount-discount;
			
		
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
	System.out.println(" billAmount: "+billAmount);
	System.out.println("discount: "+discount);
	System.out.println("final bill: "+finalbill);
	
	
	}

}
