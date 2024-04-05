package relationshipex;

public class person {
	int id;
	String name;
	MyDate dob;
    Address add;
	public person() {
		id=101;
		name="sanika";
		dob=new MyDate();
		add=new Address();
	}
	public person(int id,String name,MyDate dob,Address add) {
		this.id=id;
		this.name=name;
		this.dob=dob;
		this.add=add;
		
	}
	public void display() {
		System.out.println("person id: "+id);
		System.out.println("name: "+name);
		dob.display();
		add.show();
	}
	
}
