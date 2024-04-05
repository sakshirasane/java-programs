package java8features;

import java.util.ArrayList;
import java.util.Collections;

import collection.Student1;

class Product1{
	int productId;
	String ProductName;;
	float productPrice;
	public Product1(int productId,String ProductName,float productPrice) {
		super();
	    this.productId=productId;
	    this.ProductName=ProductName;
	    this.productPrice=productPrice;
		
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "product [productId= "+productId +" ,productname "+ProductName+" ,productPrice: "+productPrice+"]";
				}
	
}
public class LambdaInComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ArrayList<Product1> list = new ArrayList<Product1>();
 list.add(new Product1(101,"Mousepad",1200));
 list.add(new Product1(102,"laptop",1560));
 list.add(new Product1(103,"keyboard",18800));
 list.add(new Product1(104,"speaker",1260));
 list.add(new Product1(105,"printer",12300));
 
 Collections.sort(list,(p1,p2)->{
	 return p1.ProductName.compareTo(p2.ProductName);
 });
 list.forEach(p -> System.out.println(p));
 
 Collections.sort(list,(p1,p2) ->{
	 if(p1.productPrice==p2.productPrice)
		{
		return 0;
		}
		else if(p1.productPrice>p2.productPrice)
		{
			return 1;
		}
		else
		{
			return -1;	
	}
 });
 
 list.forEach(p -> System.out.println(p));

	}

}
