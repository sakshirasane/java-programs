package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapImp1 {

	private static Map<String, String> hashtable;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Map<String, String> map = new HashMap<>();
       map.put("In","India");
       map.put("Br","Brazil");
       map.put("Ge","Germany");
       map.put("Fr","France");
       map.put(null,null);
       map.put(null,null);
       
       System.out.println("implementing Hashmap:  ");
       for(Map.Entry<String,String> entry: map.entrySet()) {
       System.out.println("Country Code: "+entry.getKey()+" ,Country: "+entry.getValue());
       }
       
       System.out.println(map.get("Br"));
      Map<String, String> treeMap = new TreeMap<>();
      treeMap.put("Br102","Coffee");
      treeMap.put("L202", "Cholepuri");
      treeMap.put("Ge", "Pasta");
      treeMap.put("Br105", "Tea");
      treeMap.put("L27", "Biryani");
      //treeMap.put(null, null);
      
      System.out.println("implementing HashTable: ");
      for(Map.Entry<String,String> entry: hashtable.entrySet()) {
    	  System.out.println(" Code: "+entry.getKey()+" ,Menu "+entry.getValue());
      }
      
      
	}

}
