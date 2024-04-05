package relationshipex;

public class Address {
String Addressline,street,city,state,pincode;

public Address() {
	Addressline="chinchwadenagar";
	street="Chinchwad";
    city="pune";
    state="maharashtra";
    pincode="411033";
}

public Address(String Addressline,String street,String city,String state,String pincode) {
	this.Addressline=Addressline;
	this.street=street;
	this.city=city;
	this.state=state;
	this.pincode=pincode;
}
	public void show() {
		System.out.println(Addressline+", "+street+", "+city+", "+state+", "+pincode);
		
	}
}






