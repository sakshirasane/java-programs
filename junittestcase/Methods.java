package junittestcase;

public class Methods {

	public int sqaure(int a) {
		return a*a;
		
	}
	
	public int countA(String str) {
		int count =1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='A') {
				count++;
			}
			
		}
		return count;
	}
	
	
	
	
}
