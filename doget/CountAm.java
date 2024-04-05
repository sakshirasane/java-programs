package doget;

import java.util.Scanner;

public class CountAm {
	
public int countAm(String str) {
	int count =0;
	String  splitedstr[]=str.split(" ");
	
	for(int i=0;i<splitedstr.length;i++) {
		if(splitedstr[i].equalsIgnoreCase("am"))
			count++;
	}
	return count;
}
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
    String str=sc.nextLine(); 
	
	CountAm obj=new CountAm();
	int res=obj.countAm(str);
	System.out.println(res);
	
	
}
}
