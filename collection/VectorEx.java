package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	Vector<String> vector=new Vector<>();
	vector.addElement("Jasmine");
	vector.addElement("Rose");
	vector.addElement("Mogara");
	vector.addElement("Lily");
	vector.addElement("Rose");
	vector.addElement(null);
		
	Enumeration<String> e= vector.elements();
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
		
		
	}

}
