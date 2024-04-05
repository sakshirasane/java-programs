package collection;

public class Product {
int id;
String name;
double Price;
String description;

//constructor
public Product(int id,String name,double Price,String description) {
	this.id=id;
	this.name=name;
	this.Price=Price;
	this.description=description;
}

//getter method
public int getId() {
	return id;
	
}
public String getName() {
	return name;
}

public double getPrice() {
	return Price;
}

public String getDescription() {
	return description;
}
//setter method

public void  setPrice(double Price) {
	this.Price=Price;
	
}
public void setDescription(String description) {
	this.description=description;
}




}
