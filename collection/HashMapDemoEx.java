package collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemoEx {

	 void HashMapDemo() {
		 HashMap<Integer,String> map=new HashMap<Integer,String>();
		 map.put(1,"Mango");
		 map.put(2,"Grapes");
		 map.put(3,"Papaya");
		 map.put(4,"Apple");	

	 System.out.println("Iterating Hashmap...");
     System.out.println(" key "+" "+" value ");
     for(Entry<Integer, String> m : map.entrySet()) {
    	 System.out.println(" "+m.getKey()+" "+m.getValue());
     }
 }
	
	 
	 public static void main(String[] args) {
	HashMapDemoEx h1=new HashMapDemoEx();
	h1.HashMapDemo();
	 }
}
