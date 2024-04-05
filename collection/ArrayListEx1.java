package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list =new ArrayList();
		list.add("Raj");
		list.add(101);
		list.add(56.78);
		list.add(true);
		list.add(null);
		list.add("Raj");
		
		
		System.out.println("List Elements: "+list);
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Rose");
		list2.add("Lily");
		list2.add("Mogara");
		list2.add("Lotus");
		list2.add("Rose");
		//list2.add("Null");
		
		System.out.println("Generic List: "+list2);
		
		System.out.println("iterating list using iterator interface: ");
		Iterator<String> iterator =list2.iterator();
        while(iterator.hasNext()) {
        	System.out.println(iterator.next());
        }
        
        System.out.println("iterating ;ist using for each loop: ");
		for(String string: list2) {
			System.out.println(string);
		}
		
		System.out.println("After sorting: ");
		Collections.sort(list2);
		for(String string: list2) {
			System.out.println(string);
		}
		
		}

}
