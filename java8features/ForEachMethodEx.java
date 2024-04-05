package java8features;

import java.util.ArrayList;

public class ForEachMethodEx {
public static void main(String args[]) {
	ArrayList<String> list= new ArrayList<>();
      list.add("pune");
      list.add("Thane");
      list.add("Mumbai");
      list.add("Kolkatta");
      list.add("Delhi");
      
      list.forEach(str -> System.out.println(str));
}
}
